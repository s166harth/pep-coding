

public class Main {

  public static void main(String[] args) {
    int n=5;
    for(int i=0;i<n;i++)
    {
        if(i==0||i==n-1)
        {
            System.out.println("*****");
        }
        else
        {
            for(int k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }

  }
}