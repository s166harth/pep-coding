import java.util.Scanner;

public class expolog {
    public static int func(int x,int y)
    {
        if(y==0)return 1;
        if(y%2==0)return func(x,y/2)*func(x,y/2);
        else return func(x,y/2)*func(x,y/2)*x;
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.println(func(x, y));
    }
}
