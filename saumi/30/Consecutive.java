import java.util.*;
class Main
{
    static boolean isConsecutive(int n1, int n2, int n3)
    {
        return ((n2==n1+1)&&(n3==n2+1))||((n2==n1-1)&&(n3==n3-1));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (isConsecutive(n1,n2,n3)) System.out.println("Numbers are consecutive.");
        else System.out.println("Numbers are not consecutive");
    }
}