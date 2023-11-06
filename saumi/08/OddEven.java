class NumberPrinter {
    private int number = 1;
    private int maxNumber = 20;

    public synchronized void printEven() {
        while (number <= maxNumber) {
            if (number % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " - Even: " + number);
                number++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public synchronized void printOdd() {
        while (number <= maxNumber) {
            if (number % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " - Odd: " + number);
                number++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();

        Thread evenThread = new Thread(() -> {
            Thread.currentThread().setName("EvenThread");
            numberPrinter.printEven();
        });

        Thread oddThread = new Thread(() -> {
            Thread.currentThread().setName("OddThread");
            numberPrinter.printOdd();
        });

        evenThread.start();
        oddThread.start();
    }
}
