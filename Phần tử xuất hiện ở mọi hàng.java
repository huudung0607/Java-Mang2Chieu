import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static int []dx = {-2,-2,-1,-1,1,1,2,2};
    public static int[] dy = { -1,1,-2,2,-2,2,-1,1};
    public static int[][] a = new int[505][505];
    public static int n,s,t,u,v;
    public static void nhap(){
        n = sc.nextInt(); //s = sc.nextInt(); t = sc.nextInt(); u = sc.nextInt(); v = sc.nextInt();
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= n;j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    public static void dfs(int i,int j){
        a[i][j] = 0;
        for(int k = 0;k < 8;k++){
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if(i1 >= 1 && j1 >= 1 && i1 <= n && j1 <= n && a[i1][j1] == 1){
                dfs(i1,j1);
            }
        }
    }
    public static void main(String[] args) {
        nhap();
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        for(int i = 1;i <= n;i++){
            TreeSet<Integer> se = new TreeSet<>();
            for(int j = 1;j <= n;j++){
                se.add(a[i][j]);
            }
            for(var tmp : se){
                mp.put(tmp,mp.getOrDefault(tmp,0) + 1);
            }
        }
        Vector<Integer> v = new Vector<>();
        for(var x : mp.entrySet()){
            if(x.getValue() == n){
                v.add(x.getKey());
            }
        }
        if(v.isEmpty()) System.out.print("NOT FOUND");
        else{
            for(int i : v){
                System.out.print(i + " ");
            }
        }
    }
}
