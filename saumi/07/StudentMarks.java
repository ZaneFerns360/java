import java.util.Scanner;

class MarksValidationException extends Exception {
    public MarksValidationException(String message) {
        super(message);
    }
}

class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter internal marks: ");
            int internalMarks = scanner.nextInt();

            System.out.print("Enter external marks: ");
            int externalMarks = scanner.nextInt();

            if (internalMarks >= 40 || externalMarks >= 60) {
                throw new MarksValidationException("Invalid marks. Internal marks should be less than 40, and external marks should be less than 60.");
            }

            int totalMarks = internalMarks + externalMarks;

            System.out.println("Total marks: " + totalMarks);
        } catch (MarksValidationException e) {
            System.err.println("Exception: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.err.println("Exception: Invalid input. Please enter valid marks.");
        } finally {
            scanner.close();
        }
    }
}
