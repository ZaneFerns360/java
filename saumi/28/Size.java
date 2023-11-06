import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        float num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a floating point number:");
        num = sc.nextFloat();
        if (num==0) System.out.println("Zero");
        else
        {
            if(num<0)
            {
                System.out.print("Negative ");
                num*=-1;
            }
            else System.out.print("Positive ");
            if(num<1) System.out.println("small");
            if(num>1000000) System.out.println("large");
        }
    }
}