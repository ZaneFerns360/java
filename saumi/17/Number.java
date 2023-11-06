import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Check if a number is a palindrome");
            System.out.println("2. Generate Fibonacci sequence");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    if (isPalindrome(number)) {
                        System.out.println(number + " is a palindrome.");
                    } else {
                        System.out.println(number + " is not a palindrome.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the number of terms for the Fibonacci sequence: ");
                    int terms = scanner.nextInt();
                    generateFibonacci(terms);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        } while (choice != 3);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    // Method to generate the Fibonacci sequence
    public static void generateFibonacci(int terms) {
        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci sequence: ");
        
        for (int i = 1; i <= terms; i++) {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
    }
}
