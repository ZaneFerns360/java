// By extending the Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

// By implementing the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class thread {
    public static void main(String args[]) {
        MyThread thread1 = new MyThread();
        thread1.start();

        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();
    }
}
