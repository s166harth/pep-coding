import java.util.ArrayList;
import java.util.Scanner;

public class mazejump {
    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        ArrayList<String> ans=getMazePaths(1, 1, n, m);
        System.out.println(ans);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr==dr&&sc==dc)
        {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        ArrayList<String> paths = new ArrayList<>();
        for(int i=1;i<=dc-sc;i++)
        {
            ArrayList<String> smallans= getMazePaths(sr, sc+1, dr, dc);
            for(String s:smallans)
            {
                paths.add("H"+i+s);

            }
        }
        for(int i=1;i<=dr-sr;i++)
        {
            ArrayList<String> smallans= getMazePaths(sr+1, sc, dr, dc);
            for(String s:smallans)
            {
                paths.add("V"+i+s);

            }
        }
        for(int i=1;i<=dr-sr&&i<=dc-sc;i++)
        {
            ArrayList<String> smallans= getMazePaths(sr+1, sc+1, dr, dc);
            for(String s:smallans)
            {
                paths.add("D"+i+s);

            }
        }
        return paths;

    }
}
