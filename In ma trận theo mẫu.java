import java.lang.reflect.Array;
    import java.util.*;
    import java.lang.*;
    public class Main {
        private static int mod = 1000000007;
        public static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            int n = sc.nextInt();
            int [][]a = new int[n][n];
            for(int i = 0; i < n;i++){
                for(int j = 0; j < n;j++){
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Pattern 1:");
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    System.out.print(a[j][i] + " ");
                }
                System.out.println();
            }
            System.out.println("Pattern 2:");
            for(int i = n - 1;i >= 0;i--){
                for(int j = n - 1;j >= 0;j--){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Pattern 3:");
            for(int i = n - 1; i >= 0;i--){
                for(int j = 0; j < n;j++){
                    System.out.print(a[j][i] + " ");
                }
                System.out.println();
            }
            System.out.println("Pattern 4:");
            for(int i = 0;i < n ;i++){
                for(int j = n - 1;j >= 0;j--){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
