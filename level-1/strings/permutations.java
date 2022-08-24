
import java.util.*;

public class permutations {

	public static void solution(String str){
		int n=fact(str.length());
        for(int i=0;i<n;i++)
        {
            StringBuilder test =StringBuilder(str);
            int temp=i;
            for(int div=str.length();div>0;div--)
            {
                int q=temp/div;
                int r=temp%div;
                System.out.print(test.charAt(r));
                test.deleteCharAt(r);
                temp=q;
                

            }
            System.out.println();
        }
		
	}
    private static StringBuilder StringBuilder(String str) {
        return null;
    }
    public static int fact(int n)
    {
        int ans=1;
        while(n-->0)
        {
            ans*=n;
        }
        return ans;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}