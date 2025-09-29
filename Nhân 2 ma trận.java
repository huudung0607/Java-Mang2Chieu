import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        int [][]a = new int[n][m];
        int [][]b = new int[m][p];
        for(int i = 0; i < n ;i++){
            for(int j = 0;j < m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < m ;i++){
            for(int j = 0;j < p;j++){
                b[i][j] = sc.nextInt();
            }
        }
        long [][]c = new long[n][p];
        for(int i = 0; i < n ;i++){
            for(int j = 0;j < p;j++){
                c[i][j] = 0;
                for(int k = 0;k < m;k++){
                    c[i][j] += 1l * a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
