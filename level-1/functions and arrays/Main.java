import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int prev=s.nextInt();
       int count =0;
        int i=1;
        
        
        
        while(i<n)
        {
            int num=s.nextInt();
            if(num==prev)
            {
                System.out.println(false);
                return;
            }
            else if(num>prev)
            {
                prev=num;
                count++;
            }
            i++;
        }
        if(count==0||count==1)System.out.println(true);
        else System.out.println(false);
        
       
        
        
        

	}
}
