import java.util.*;
import java.io.*;
public class subsets {
    public static void main(String[] args) throws Exception {
       Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
           arr[i] = s.nextInt();
        }
        int terms= (int)Math.pow(2,n);

        for(int i=0;i<terms;i++)
        {
            int temp=i;
            for(int j=n-1;j>=0;j--)
            {
                int r=temp%2;
                temp/=2;
                if(r==0)
                {
                    System.out.print("-\t");
                }
                else{
                    System.out.print(arr[j]+"\t");
                }
            }
            System.out.println();
        }

    
        
     }
}
