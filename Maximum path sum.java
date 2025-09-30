import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static int[] dx = { -1,0,0,1 };
    public static int[] dy = { 0,-1,1,0 };
    public static int n,m;
    public static int [][]a = new int[505][505];
    public static long [][]F = new long[505][505];
    public static void input(){
        n = sc.nextInt(); m = sc.nextInt();
        for(int i = 1;i <= n ;i++){
            for(int j =1;j <= m;j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    public static void dfs(int i,int j){
        if(i == n && j == m){
            //ans = Math.max(ans,cost);
            return;
        }
        for(int k = 0;k < 4;k++){
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if(i1 >= 0 && j1 >= 0 && i1 < n && j1 < m){
               // cost += a[i1][j1];
                dfs(i1,j1);
               // cost -= a[i1][j1];
            }
        }
    }
    public static void main(String[] args) {
        input();
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= m;j++){
                if(i == 1 && j == 1){
                    F[i][j] = a[i][j];
                }
                else{
                    F[i][j] = Math.max(F[i - 1][j],F[i][j - 1]) + a[i][j];
                }
            }
        }
        System.out.print(F[n][m]);
    }
}
