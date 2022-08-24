import java.util.Scanner;

public class zigzag {
    public static void func(int x)
    {
        if(x==0)return;
        if(x==1)System.out.print("111");
        System.out.print(x);
        func(x-1);
        System.out.print(x);
        func(x-1);
        System.out.print(x);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        func(x);
    }
}
