import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static int[] dx = { -1,0,0,1};
    public static int[] dy = { 0,-1,1,0  };
    public static char[][] a = new char[505][505];
    public static int n, s, t, u, v, m;
    public static int cnt;

    public static void nhap() {
        n = sc.nextInt(); m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String tmp = sc.next();
            for (int j = 1; j <= m; j++) {
                a[i][j] = tmp.charAt(j - 1);
            }
        }
    }

    public static void dfs(int i, int j) {
        cnt++;
        a[i][j] = '.';
        for (int k = 0; k < 4; k++) {
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if (i1 >= 1 && j1 >= 1 && i1 <= n && j1 <= m && a[i1][j1] == '*') {
                dfs(i1, j1);
            }
        }
    }
    public static long[][] F = new long[505][505];
    public static void main(String[] args) {
        nhap();
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i <= n ;i++){
            for(int j = 1;j <= m;j++){
                if(a[i][j] == '*'){
                    cnt = 0;
                    dfs(i,j);
                    list.add(cnt);
                }
            }
        }
        Collections.sort(list);
        for(int i : list){
            System.out.print(i +" ");
        }
    }
}
