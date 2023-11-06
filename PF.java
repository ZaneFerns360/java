import java.util.Scanner;

public class PF{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose Palindrome-1 or Fibonacci-2");
    int choice = sc.nextInt();
    sc.nextLine();
    switch(choice){
      case 1:
     System.out.println("Enter a String:");
      String str = sc.nextLine();
      Palindrome.Palindrome(str);
      break;
      case 2:
     System.out.println("Enter a number:");
      int num = sc.nextInt();
      Fibonacci.Fibonacci(num);
      break;  
    default:
     System.out.println("Invalid choice");
} 
  }
    }

class Palindrome{
  public static void Palindrome(String str){
    int len = str.length();
    for(int i=0; i<len/2; i++){
      if(str.charAt(i) != str.charAt(len-i-1)){
        System.out.println("Not a Palindrome");
        return;
      }
    }
    System.out.println("It is a Palindrome");
  }
}

class Fibonacci{
 public static void Fibonacci(int n){
   int a=0,b=1;
   for(int i=0; i<=n; i++){
     System.out.println(a+" ");
     int c = a +b;
     a = b;
     b = c;
   }
 }
}
