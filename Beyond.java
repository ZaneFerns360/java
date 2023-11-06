import java.util.Scanner;

class Beyond{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      try{
        if(num > 10 || num < 1){
          throw new Exception("Wrong Input");
        }
      }
      catch(Exception e){
       System.out.println("e.getMessage()");
      }
      finally{
      sc.close();
      }
    }
  }


