import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
      Scanner s =new Scanner(System.in);
      int num1 = s.nextInt();
      int num2 = s.nextInt();
      int t1=num1;
      int t2=num2;
      while(num1%num2!=0)
      {
        int rem = num1%num2;
        num1=num2;
        num2=rem;
      }
      System.out.println(num2);
      System.out.println((int)((t1*t2)/num2));
     }
    }