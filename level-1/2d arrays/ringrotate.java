import java.io.*;
import java.util.*;

public class ringrotate {

    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m= s.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                
                arr[i][j]=s.nextInt();
            }
        }

        int shell = s.nextInt();
        int r=s.nextInt();

        int[] oned = makeoned(arr,shell);
        // reverse(oned,0,oned.length-r-1);
        // reverse(oned,oned.length-r,oned.length-1);
        // reverse(oned,0,oned.length-1);
        // fillback(arr,shell,oned);
        for(int i=0;i<oned.length-1;i++)
        {
            System.out.println(oned[i]);
        }
        // display(arr);
    }


    public static int[] makeoned(int[][] arr,int shell)
    {
        int minr=shell-1,minc=shell-1;
        int maxr=arr.length-shell,maxc=arr[0].length-shell;
        int size = 2*(maxr-minr+maxc-minc);
        int[] ans = new int[size];
        int idx=0;
        for(int i=minr;i<maxr;i++)
        {
            ans[idx]=arr[i][minc];
            idx++;
        }
        for(int i=minc;i<maxc;i++)
        {
            ans[idx]=arr[maxr][i];
            idx++;
        }
        for(int i=maxr;i<minr;i--)
        {
            ans[idx]=arr[i][maxc];
            idx++;
        }
        for(int i=maxc;i>minc;i--)
        {
            ans[idx]=arr[minr][i];
            idx++;
        }
        return ans;
    }



    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}