import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int t= s.nextInt();
    for(int i=1;i*i<=t;i++)
    {
      System.out.println(i*i);
    }  
   }
  }