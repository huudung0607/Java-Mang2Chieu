import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt(), y = sc.nextInt();
        x--;y--;
        for(int i = 0;i < n;i++){
            int tmp = a[i][x];
            a[i][x] = a[i][y];
            a[i][y] = tmp;
        }
        for(int i = 0; i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
