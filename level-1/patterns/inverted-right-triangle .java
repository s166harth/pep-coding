import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n=scn.nextInt();
        for(int i=n;i>0;i--)
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
