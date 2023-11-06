import java.util.Scanner;

public class IE{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Internal Marks:");
   try{
     int internal = sc.nextInt();
     if(internal < 40){
       throw new Exception("Internal Marks too low");
     }
   }
   catch(Exception e){
    System.out.println(e.getMessage());
   }
   finally{
    System.out.println("You Passed");
    }
  }
}
