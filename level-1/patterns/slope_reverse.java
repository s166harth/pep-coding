import java.util.Scanner;

public class slope_reverse {
   public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int sp=0;sp<n-i;sp++)
        {
            System.out.print("    ");
        }
        System.out.print("*");
        System.out.println();
    }
   }
}
