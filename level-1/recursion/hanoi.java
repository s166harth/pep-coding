import java.util.Scanner;

public class hanoi {

    public static void func(int disks,int s,int a,int d)
    {
        if(disks<=0)return;
        func(disks-1,s,d,a);
        System.out.println(s+" "+d);
        func(disks-1,a,d,s);
        
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int start=1,aux=2,dest=3;
        func(n,start,aux,dest);
    }
    
}
