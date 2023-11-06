import java.util.InputMismatchException;

class Main {
    public static void main(String[] args) {
        try {
            // 1. Generate and handle ArithmeticException
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: " + e.getMessage());
        }

        try {
            // 2. Generate and handle NullPointerException
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.err.println("NullPointerException caught: " + e.getMessage());
        }

        try {
            // 3. Generate and handle InputMismatchException
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("InputMismatchException caught: " + e.getMessage());
        } 

        // Finally block executed
        System.out.println("Finally block executed");
    }
}
