import Utility.Array;
import Utility.UtoL;
import java.util.*;

class Demo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter string:");
String str=sc.nextLine();
System.out.println(UtoL.lower(str));

System.out.println("Enter the size of array");
int n= sc.nextInt();
int a[]= new int[n];

System.out.println("Enter elements");
for(int i=0; i<n; i++)
{
a[i]=sc.nextInt();
}

System.out.println(Array.Symmetry(a));

}
}