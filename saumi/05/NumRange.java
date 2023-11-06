import java.util.Scanner;

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number between 1 and 10: ");
            int number = scanner.nextInt();

            if (number < 1 || number > 10) {
                throw new OutOfRangeException("Input is out of the valid range (1-10).");
            }

            System.out.println("You entered a valid number: " + number);
        } catch (OutOfRangeException e) {
            System.err.println("Exception: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.err.println("Exception: Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
