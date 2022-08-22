import java.util.*;
public class first_and_last_bs {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            int n=s.nextInt();

            int val=s.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();

            }
            int l=0,h=n-1;
            int li=n-1,fi=0;
            while(h>l)
            {
                int mid = (h+l)/2;

                if(arr[mid]==val)
                {
                    li=mid;
                    l=mid+1;

                }
                else if(arr[mid]>val)h=mid-1;
                else l=mid+1;

            }
            l=0;h=n-1;
            while(h>l)
            {
                int mid = (h+l)/2;
                if(arr[mid]==val)
                {
                    fi=mid;
                    h=mid-1;

                }
                else if(arr[mid]>val)h=mid-1;
                else l=mid+1;

            }
            System.out.println(fi+"/t"+li);
        }
     }
    
}
