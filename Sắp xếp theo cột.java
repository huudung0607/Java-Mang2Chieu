import com.sun.source.tree.Tree;

import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void Swap(int []a ,int n){
        for(int i = 0;i < n;i++){
            int min = i;
            for(int j = i + 1;j < n;j++){
                if(a[min] > a[j]) {
                    min = j;
                }
            }
            int tmp = a[min];
            a[min] = a[i];
            a[i] = tmp;
        }
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int [][]a = new int[n][n];
        int [][]b = new int[n][n];
        for(int i = 0;i < n ;i++){
            for(int j =0;j < n;j++){
                a[i][j]= sc.nextInt();
            }
        }
        for(int i = 0;i < n ;i++){
            for(int j =0;j < n;j++){
                b[i][j] = a[j][i];
            }
        }
        for(int i = 0; i < n;i++){
            Swap(b[i],n);
        }
        for(int i = 0;i < n ;i++){
            for(int j = 0;j < n;j++){
                System.out.print(b[j][i] + " ");
            }
            System.out.println();
        }
    }
}
