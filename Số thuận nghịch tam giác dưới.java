import java.util.Scanner;

public class Main {
    static int thuannghich(int n) {
        int temp = n;
        int sum = 0;
        while (n != 0) {
            sum = sum * 10 + n % 10;
            n /= 10;
        }
        return sum == temp ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (thuannghich(a[i][j]) == 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
