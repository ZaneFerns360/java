import java.util.Scanner;

public class Increasing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Input second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Input third number: ");
        int num3 = scanner.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing order");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
