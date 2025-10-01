import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static int[] dx = {-1,-1,-1,0,0,1,1,1};
    public static int[] dy = {-1,0,1,-1,1,-1,0,1};
    public static int[][] a = new int[505][505];
    public static int n, s, t, u, v, m;
    public static int cnt;

    public static void nhap() {
        n = sc.nextInt();
        //m = sc.nextInt(); //s = sc.nextInt(); t = sc.nextInt(); u = sc.nextInt(); v = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int x = sc.nextInt();
                a[j][i] = x;
            }
        }
    }

    public static void dfs(int i, int j) {
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
        int maxSum = -1;
        for(int i = 2; i <= n - 1;i++){
            for(int j = 2;j <= n - 1;j++){
                int sum = a[i][j];
                for(int k = 0;k < 8;k++){
                    int i1 = i + dx[k];
                    int j1 = j + dy[k];
                    sum += a[i1][j1];
                }
                maxSum = Math.max(maxSum,sum);
            }
        }
        System.out.print(maxSum);
    }
}
