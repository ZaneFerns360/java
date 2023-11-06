import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the term number for the Fibonacci sequence: ");
        
        int termNumber = scanner.nextInt();
        int fibonacciTerm = generateFibonacciTerm(termNumber);
        System.out.println("Fibonacci term " + termNumber + " is: " + fibonacciTerm);
        
    }

    public static int generateFibonacciTerm(int n) {
        if (n <= 2) {
            return 1;
        }

        int term1 = 1;
        int term2 = 1;
        int fibonacciTerm = 0;

        for (int i = 3; i <= n; i++) {
            fibonacciTerm = term1 + term2;
            term1 = term2;
            term2 = fibonacciTerm;
        }

        return fibonacciTerm;
    }
}
