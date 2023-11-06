class T1 extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(Thread.currentThread().getId() + " " + i);
        }
    }
}

class T2 extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(Thread.currentThread().getId() + " " + i);
        }
    }
}

public class MultiThread {
    public static void main(String args[]) {
        T1 thread1 = new T1();
        T2 thread2 = new T2();

        thread1.start();
        thread2.start();
try {
            Thread.sleep(50);
        } catch (Exception e) {
            
        }
    }
}
