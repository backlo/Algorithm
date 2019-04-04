import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    private static int bfs(int[][] arr, int m, int n) {
        Queue<int[]> q = new LinkedList<>();
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    int index[] = new int[2];
                    index[0] = i;
                    index[1] = j;
                    q.offer(index);
                }
            }
        }

        int mx[] = {0, 0, -1, 1};
        int my[] = {-1, 1, 0, 0};

        while (!q.isEmpty()) {
            int size = q.size();
            for (int k = 0; k < size; k++) {
                int[] current = q.poll();

                for (int i = 0; i < 4; i++) {
                    int[] next = new int[2];
                    next[0] = current[0] + mx[i];
                    next[1] = current[1] + my[i];
                    if (next[0] > n || next[1] > m || next[0] <= 0 || next[1] <= 0) {
                        continue;
                    }
                    if (arr[next[0]][next[1]] == 0) {
                        arr[next[0]][next[1]] = 1;
                        q.offer(next);
                    }
                }
                if(q.isEmpty()){
                    return count;
                }
            }

            count++;
        }

        return count;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        int[][] arr = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            String[] index = br.readLine().split(" ");
            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(index[j - 1]);
            }
        }

        int count = bfs(arr, m, n);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (arr[i][j] == 0) {
                    count = -1;
                }
            }
        }
        System.out.println(count);
    }
}
