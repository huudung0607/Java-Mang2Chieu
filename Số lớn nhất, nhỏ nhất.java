import java.util.Scanner;

public class Main {
    public static int binarySearch(int[] a, int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m] == x) {
                res = m;
                return res;
            } else if (a[m] > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int maxval = Integer.MIN_VALUE;
        int minval = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] > maxval) maxval = a[i][j];
                if (a[i][j] < minval) minval = a[i][j];
            }
        }

        System.out.println(minval);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == minval) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }

        System.out.println(maxval);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == maxval) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
        sc.close();
    }
}
