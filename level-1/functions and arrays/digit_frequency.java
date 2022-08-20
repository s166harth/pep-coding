import java.util.Scanner;

public class digit_frequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int ans=0;
        while(n>0)
        {
            if(n%10==d) ans++;
            n/=10;

        }
        return ans;
    }
}
