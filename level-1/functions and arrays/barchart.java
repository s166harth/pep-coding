import java.io.*;
import java.util.*;

public class barchart{

public static void main(String[] args) throws Exception {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=s.nextInt();

    }
    int max=-1;
    for(int i=0;i<n;i++)
    {
        if(arr[i]>max)max=arr[i];
    }
    for(int i=max;i>0;i--)
    {
        for(int j=0;j<n;j++)
        {
            if(i==arr[j])
            {
                System.out.print("*");
                arr[j]--;
            }
            else{
                System.out.print(" ");
            }
            
        }
        System.out.println();
    }
 }

}