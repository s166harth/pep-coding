import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    int temp1=n;
    int nod=0;
    int k= s.nextInt();
    while(temp1>0)
    {
        temp1/=10;
        nod++;


    }
    k = k%nod;
    if(k<0)
    {
        k = nod+k;
    }
    int i=1;
    int mul=1;
    int div=1;
    while(i<=nod)
    {
        if(i<=k) div*=10;
        else mul*=10;
        i++;
    }
    int quo = n/div;
    int rem = n%div;
    int ans = (rem*mul)+quo;
    System.out.println(ans);
  }
}