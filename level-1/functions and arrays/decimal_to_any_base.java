import java.util.*;
  
  public class decimal_to_any_base{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
       int ans=0;
       int p=0;
       while(n>0)
       {
        ans+= (n%b)*Math.pow(10,p);
        n/=b;
        p++;
       }
       return ans;
   }
  }