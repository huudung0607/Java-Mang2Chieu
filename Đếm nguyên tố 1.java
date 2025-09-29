import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int [][]a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int dem = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (prime(a[i][i])) {
                    dem++;
                }
                if (prime(a[i][n - i - 1])) {
                    dem++;
                }
            }
            System.out.println(dem);
        } else {
            int num = a[n / 2][n / 2];
            if (prime(num)) {
                dem++;
                a[n / 2][n / 2] = 0;
            }
            for (int i = 0; i < n; i++) {
                if (prime(a[i][i])) {
                    dem++;
                }
                if (prime(a[i][n - i - 1])) {
                    dem++;
                }
            }
            System.out.println(dem);
        }
    }
}
