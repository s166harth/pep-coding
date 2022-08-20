import java.util.Scanner;

public class findelement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       int t=s.nextInt();
       int[] arr = new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=s.nextInt();
        }
        int d=s.nextInt();
        for(int i=0;i<t;i++)
        {
            if(arr[i]==d){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);

    }
}
