import java.util.Scanner;

public class fibonacci_triangle {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int a=0,b=1;
        for(int i=1;i<=n;i++)
        {   
            for(int j=1;j<=i;j++)
                {
                    System.out.print(a+"    ");
                    int c=a+b;
                    a=b;
                    b=c;

                }
                System.out.println();

        }
    }
}
