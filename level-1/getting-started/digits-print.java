import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner s= new Scanner(System.in);
      int n = s.nextInt();
      int k=n;
    int p =0;
      while(n>0){
        p++;
        n/=10;
      }
      s.close(); 
      int div = (int)Math.pow(10, p-1);
      while(div!=0)
      {
        int q = k/div;
        System.out.println(q);
        k%=div;
        div/=10;
      }
     }
    }