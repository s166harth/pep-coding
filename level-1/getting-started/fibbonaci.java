import java.util.*;
  
  public class fibbonaci{
  
  public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      int n= s.nextInt();
      int a=0,b=1,c=0;
      while(a<n)
      {
        System.out.println(a);
        c=a+b;
        a=b;
        b=c;
      }
   }
  }