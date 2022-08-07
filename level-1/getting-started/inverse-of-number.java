import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  int n = s.nextInt();
  int ans=0;
  int seek = 1;

  while(n>0)
  {
    int d = n%10;
    ans+= seek*Math.pow(10,d-1);
    n/=10;
    seek++;
  } 
  System.out.println(ans);
 }
}