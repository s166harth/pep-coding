import java.util.*;
  
  public class anybase_to_anybase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int ans=0;
     int p=0;
     while(n>0)
     {
        ans+= (n%destBase)*(Math.pow(sourceBase, p));
        p++;
     }
     System.out.println(ans);
   }   
  }