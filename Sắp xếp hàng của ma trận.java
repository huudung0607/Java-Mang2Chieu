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
        Vector<Vector<Integer>> a = new Vector<>();
        for(int i = 0;i < n;i++){
            Vector<Integer> tmp = new Vector<>();
            for(int j = 0;j < n;j++){
                int x = sc.nextInt();
                tmp.add(x);
            }
            a.add(tmp);
        }
        for(var tmp : a){
            Collections.sort(tmp);
            for(int i : tmp){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
