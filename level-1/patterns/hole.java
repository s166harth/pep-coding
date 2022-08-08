import java.util.Scanner;

public class hole {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int st=n+1;
        int sp=1;
        for(int i=1;i<=n;i++)
        {
            for(int l=0;l<st/2;l++)
            {
                System.out.print("* ");
            }
            for(int j=0;j<sp;j++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<st/2;j++)
            {
                System.out.print("* ");
            }
            if(i<=n/2){
            st-=2;
            sp++;}
            else{
                st+=2;
                sp--;
            }
            System.out.println();
        }
    }
}
