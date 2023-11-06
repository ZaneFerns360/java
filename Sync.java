class Counter {
    int count = 0;
    public synchronized void increment() {
        count++;
    }
}

class IncrementThread extends Thread {
    Counter counter;
    public IncrementThread(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}

public class Sync {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        IncrementThread thread1 = new IncrementThread(counter);
        IncrementThread thread2 = new IncrementThread(counter);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Counter: " + counter.count);
    }
}
