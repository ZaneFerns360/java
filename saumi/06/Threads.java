// Using the Thread class
class ThreadExample1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread1: " + i);
        }
    }
}

// Using the Runnable interface
class ThreadExample2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread2: " + i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Create and start the first thread using the Thread class
        ThreadExample1 thread1 = new ThreadExample1();
        thread1.start();

        // Create and start the second thread using the Runnable interface
        Thread thread2 = new Thread(new ThreadExample2());
        thread2.start();
    }
}
