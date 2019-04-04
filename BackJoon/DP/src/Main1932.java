import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1932 {

    private static int Max(int num1, int num2){ return num1 > num2 ? num1:num2; }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+1][n+2];
        int[][] d = new int[n+1][n+2];
        int max=-1;

        for(int i = 1 ; i <= n ; i++){
            String[] index = br.readLine().split(" ");
            for(int j = 1 ; j <= index.length ; j++ ){
                arr[i][j] = Integer.parseInt(index[j-1]);
            }
        }

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                d[i][j] = Max(d[i-1][j-1], d[i-1][j]) + arr[i][j];
            }
        }

        for(int i = 1 ; i <= n ; i++){
            max = Max(max, d[n][i]);
        }

        System.out.println(max);
    }
}
