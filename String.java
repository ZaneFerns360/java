import java.util.Scanner;

public class String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        StringBuffer sb1 = new StringBuffer(scanner.nextLine());

        System.out.println("Enter the second string:");
        StringBuffer sb2 = new StringBuffer(scanner.nextLine());

        // Demonstrate append()
        sb1.append(sb2);
        System.out.println("After append: " + sb1);

        // Demonstrate insert()
        sb1.insert(5, sb2);
        System.out.println("After insert: " + sb1);

        // Demonstrate replace()
        sb1.replace(5, 10, "REPLACE");
        System.out.println("After replace: " + sb1);

        // Demonstrate delete()
        sb1.delete(5, 10);
        System.out.println("After delete: " + sb1);

        // Demonstrate reverse()
        sb1.reverse();
        System.out.println("After reverse: " + sb1);

        // Demonstrate length()
        System.out.println("Length: " + sb1.length());

        scanner.close();
    }
}

