import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    int t =0;
    while(n>0)
    {
        n=n/10;
        t++;
    } 
    System.out.println(t);
   }
  }