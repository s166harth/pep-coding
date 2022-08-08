import java.util.*;

public class p1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        for(int i=1;i<=n;i++)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print
                ("*	");
                j++;
            }
            System.out.println();

        }

    }
}
