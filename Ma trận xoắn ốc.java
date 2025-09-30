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
        int [][]a = new int[n][n];
        int hang1 = 0, cot1 = 0, hang2 = n - 1,cot2 = n - 1;
        int dem = 1;
        while(hang1 <= hang2 && cot1 <= cot2){
            for(int i = cot1; i <= cot2;i++){
                a[hang1][i] = dem++;
            }
            hang1++;
            for (int i = hang1; i <= hang2; i++) {
                a[i][cot2] = dem++;
            }
            cot2--;
            if (cot1 <= cot2) {
                for (int i = cot2; i >= cot1; i--) {
                    a[hang2][i] = dem++;
                }
                hang2--;
            }
            if (hang1 <= hang2) {
                for (int i = hang2; i >= hang1; i--) {
                    a[i][cot1] = dem++;
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
