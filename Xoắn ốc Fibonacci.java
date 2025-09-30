import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static long []F = new long[505];
    public static void fibo(){
        F[0] = 0;F[1] = 1;
        for(int i =2;i <= 92;i++){
            F[i] = F[i - 1] + F[i - 2];
        }
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        long [][]a = new long[n][n];
        int hang1 = 0, cot1 = 0, hang2 = n - 1,cot2 = n - 1;
        int dem = 0;
        fibo();
        while(hang1 <= hang2 && cot1 <= cot2){
            for(int i = cot1; i <= cot2;i++){
                a[hang1][i] = F[dem++];
            }
            hang1++;
            for (int i = hang1; i <= hang2; i++) {
                a[i][cot2] = F[dem++];
            }
            cot2--;
            if (cot1 <= cot2) {
                for (int i = cot2; i >= cot1; i--) {
                    a[hang2][i] = F[dem++];
                }
                hang2--;
            }
            if (hang1 <= hang2) {
                for (int i = hang2; i >= hang1; i--) {
                    a[i][cot1] = F[dem++];
                }
                cot1++;
            }
        }
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
