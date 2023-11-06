import java.util.*;

/* class Customer{
  String str;
  public void askProducer(String str){
    System.out.println("Enter an item:");
    Scanner sc = new Scanner(System.in);
    this.str = sc.nextLine();  
  }
}
 */
class Producer{
  public synchronized void getItem(String str){
   System.out.println(str);
  }
}

class Ask extends Thread{
  customer Customer;
  public Ask(Producer producer,String str){
    Producer.getItem(str);
  }
}

public class WaitNotify{
  public static void main(String[] args) {
    Producer producer = new Producer();
    Ask thread1 = new Ask(producer, Water);
    Ask thread2 = new Ask(producer, Wine);
    Ask thread3 = new Ask(producer, Bread);
    thread1.start();
    thread2.start();
    thread3.start();
    thread1.join();
    thread2.join();
    thread3.join();

  }
}


import java.util.*;

class Producer {
    private String item;
    private boolean produced = false;

    public synchronized void produce(String item) {
        while (produced) {
            try {
                wait(); // Wait if an item is already produced
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        this.item = item;
        System.out.println("Producer produced: " + item);
        produced = true;
        notify(); // Notify consumer that an item is ready
    }

    public synchronized String consume() {
        while (!produced) {
            try {
                wait(); // Wait if no item is produced yet
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Consumer consumed: " + item);
        produced = false;
        notify(); // Notify producer to produce another item
        return item;
    }
}

class Ask extends Thread {
    private Producer producer;
    private String item;

    public Ask(Producer producer, String item) {
        this.producer = producer;
        this.item = item;
    }

    @Override
    public void run() {
        producer.produce(item);
    }
}

class Consume extends Thread {
    private Producer producer;

    public Consume(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        String consumedItem = producer.consume();
    }
}

public class WaitNotify {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Ask producerThread1 = new Ask(producer, "Water");
        Ask producerThread2 = new Ask(producer, "Wine");
        Ask producerThread3 = new Ask(producer, "Bread");
        Consume consumerThread = new Consume(producer);

        producerThread1.start();
        producerThread2.start();
        producerThread3.start();
        consumerThread.start();

        try {
            producerThread1.join();
            producerThread2.join();
            producerThread3.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
