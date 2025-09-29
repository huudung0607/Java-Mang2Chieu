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
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        Set<Integer> se = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (prime(a[i][i]) && !se.contains(a[i][i])) {
                se.add(a[i][i]);
                cnt++;
            }
            if (prime(a[i][n - i - 1]) && !se.contains(a[i][n - i - 1])) {
                se.add(a[i][n - i - 1]);
                cnt++;
            }
        }
        System.out.println(cnt);
        }
    }
}
