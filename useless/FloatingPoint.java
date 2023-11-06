import java.util.Scanner;

public class FloatingPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        double number = scanner.nextDouble();

        if (number == 0) {
            System.out.println("Zero");
        } else if (number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        if (Math.abs(number) < 1) {
            System.out.println("Small");
        } else if (Math.abs(number) > 1000000) {
            System.out.println("Large");
        }
    }
}
