import java.lang.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the strings:");
        String str1= sc.nextLine();
        String str2= sc.nextLine();

        StringBuffer s=new StringBuffer();

        s.append(str1);
        s.append(" to ");
        s.append(str2);
        System.out.println(s.toString());

        s.insert(16,"A");
        System.out.println("string after insertion");
        System.out.println(s.toString());

        s.replace(8,10, "at");
        System.out.println("string after replacement");
        System.out.println(s.toString());

        s.reverse();
        System.out.println("string after reverse");
        System.out.println(s.toString());
        s.reverse();

        s.delete(8,10);
        System.out.println("string after deletion");
        System.out.println(s.toString());

        int z= s.length();
        System.out.println("length is:" +z);

        String a=s.substring(6);
        System.out.println("substring is:" +a);
    }

}

/*
Output-
Enter the strings:
Welcome 
Comps A
Welcome to Comps A
string after insertion
Welcome to CompsA A
string after replacement
Welcome at CompsA A
string after reverse
A AspmoC ta emocleW
string after deletion
Welcome  CompsA A
length is:17
substring is:e  CompsA A
*/