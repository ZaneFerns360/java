class Main {
    private static int sharedCounter = 0;
    private static final int NUM_THREADS = 5;
    private static final int NUM_INCREMENTS = 10000;

    public static void main(String[] args) {
        // Create an array to hold thread references
        Thread[] threads = new Thread[NUM_THREADS];

        // Create and start multiple threads
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(new IncrementTask());
            threads[i].start();
        }

        // Wait for all threads to complete
        for (int i = 0; i < NUM_THREADS; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final Shared Counter Value: " + sharedCounter);
    }

    // Runnable task to increment the shared counter
    static class IncrementTask implements Runnable {
        public void run() {
            for (int i = 0; i < NUM_INCREMENTS; i++) {
                incrementSharedCounter();
            }
        }

        private void incrementSharedCounter() {
            synchronized (Main.class) {
                sharedCounter++;
            }
        }
    }
}
