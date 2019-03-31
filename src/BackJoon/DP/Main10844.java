package BackJoon.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main10844 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //long start = System.currentTimeMillis();
        
        long[][] dp = new long[n + 1][10];
        long answer = 0;

        for(int i = 1 ; i < 10 ; i++){
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for(int j = 0 ; j < 10 ; j ++){
                if( j == 0){
                    dp[i][j] = (dp[i-1][j+1]) % 1000000000;
                } else if( j == 9){
                    dp[i][j] = (dp[i-1][j-1]) % 1000000000;
                } else{
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
                }
            }
        }

        for(int k = 0 ; k < 10 ; k++){
            answer += dp[n][k];
        }

        System.out.println(answer % 1000000000);

        //long end = System.currentTimeMillis();
        //System.out.println("실행 시간 : " + (end-start)/1000.0);
    }
}
