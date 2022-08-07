import java.util.*;
  
  public class primecheck{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      while(t-->0)
      {
        int n = scn.nextInt();
        int flag=0;
        if(n==1){
          System.out.println("not prime");
          continue;
        }
        for(int i=2;i*i<=n;i++)
        {
          if(n%i==0) flag=1;
        }
        if(flag==0) System.out.println("prime");
        else System.out.println("not prime");

      }
  
   }
  }