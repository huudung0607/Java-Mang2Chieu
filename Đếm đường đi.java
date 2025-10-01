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
    public static int[][] a = new int[505][505];
    public static int n,m;
    public static void nhap() {
        n = sc.nextInt(); m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }
    static long[][] F = new long[505][505];
    public static void main(String[] args) {
        nhap();
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= m;j++) {
                if (i == 1 && j == 1) {
                    F[i][j] = a[i][j];
                }
                else if(a[i][j] == 1){
                    F[i][j] = F[i - 1][j] + F[i][j - 1];
                }
                else if(a[i][j] == 0) F[i][j] = 0;
            }
        }
        System.out.print(F[n][m]);
    }
}
