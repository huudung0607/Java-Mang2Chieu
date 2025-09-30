import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static int[] dx = { -1,0,0,1};
    public static int[] dy = { 0,-1,1,0 };
    public static int n,m;
    public static int [][]a = new int[505][505];
    public static void input(){
        n = sc.nextInt(); m = sc.nextInt();
        for(int i = 0;i < n ;i++){
            for(int j =0;j < m;j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    public static void dfs(int i,int j){
        a[i][j] = 0;
        for(int k = 0;k < 4;k++){
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if(i1 >= 0 && j1 >= 0 && i1 < n && j1 < m && a[i1][j1] == 1){
                dfs(i1,j1);
            }
        }
    }
    public static void main(String[] args) {
        input();
        int cnt = 0;
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(a[i][j] == 1){
                    cnt++;
                    dfs(i,j);
                }
            }
        }
        System.out.print(cnt);
    }
}
