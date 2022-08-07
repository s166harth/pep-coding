import java.util.*;

public class Main{
    public static boolean check(int n)
    {
        int flag=0;
        
        for(int i=2;i*i<=n;i++)
        {
          if(n%i==0) flag=1;
        }
        if(flag==0) return true;
        else return false;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l=s.nextInt();
        int h= s.nextInt();
        for(int i=l;i<h;i++)
        {
            if(check(i)) System.out.println(i);
        }

    }
}