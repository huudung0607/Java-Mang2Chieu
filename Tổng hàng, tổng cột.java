import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            long sum1 = 0;
            for (int j = 0; j < m; j++) {
                sum1 += a[i][j];
            }
            System.out.print(sum1 + " ");
        }
        System.out.println();

        for (int i = 0; i < m; i++) {
            long sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum2 += a[j][i];
            }
            System.out.print(sum2 + " ");
        }
    }
}
