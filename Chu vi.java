import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static char[][] a;
    static boolean[][] visited;
    static int n, m;

    static void floodfill(int i, int j, int[] res) {
        visited[i][j] = true;
        int cnt = 0;
        for (int k = 0; k < 4; k++) {
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if (i1 >= 0 && i1 < n && j1 >= 0 && j1 < m && a[i1][j1] == '1') {
                cnt++;
                if (!visited[i1][j1]) {
                    floodfill(i1, j1, res);
                }
            }
        }
        res[0] = res[0] + 4 - cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new char[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.next().charAt(0);
                visited[i][j] = false;
            }
        }
        List<Integer> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == '1' && !visited[i][j]) {
                    int[] res = new int[1];
                    res[0] = 0;
                    floodfill(i, j, res);
                    v.add(res[0]);
                }
            }
        }
        for (int x : v) {
            System.out.print(x + " ");
        }
    }
}
