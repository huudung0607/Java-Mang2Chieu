import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static int[] dx = {-1, 0, 0, 1};
    public static int[] dy = {0, -1, 1, 0};
    public static int[][] a = new int[505][505];
    public static int n, s, t, u, v, m;
    public static int cnt;

    public static void nhap() {
        n = sc.nextInt();
        //m = sc.nextInt(); //s = sc.nextInt(); t = sc.nextInt(); u = sc.nextInt(); v = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public static void dfs(int i, int j) {
        cnt++;
        a[i][j] = 0;
        for (int k = 0; k < 4; k++) {
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if (i1 >= 1 && j1 >= 1 && i1 <= n && j1 <= m && a[i1][j1] == 1) {
                dfs(i1, j1);
            }
        }
    }
    public static long[][] F = new long[505][505];
    public static void main(String[] args) {
        nhap();
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                if(i == 1){
                    F[i][j] = a[i][j];
                }
                else{
                    F[i][j] = Math.max(F[i - 1][j - 1],Math.max(F[i - 1][j],F[i - 1][j + 1])) + a[i][j];
                }
            }
        }
        long maxVal = -1;
        for(int i = 1;i <= n;i++){
            maxVal = Math.max(maxVal,F[n][i]);
        }
        System.out.print(maxVal);
    }
}
