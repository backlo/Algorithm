package BackJoon.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1003 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int k = 0 ; k < arr.length ; k++){
            int dp[][] = new int[arr[k]+1][2];
            if(arr[k] == 0){
                System.out.println("1 0");
                continue;
            }
            dp[0][0] = dp[1][1] = 1;
            dp[0][1] = dp[1][0] = 0;
            for(int i = 2 ; i <= arr[k] ; i++){
                dp[i][0] = dp[i-1][0] + dp[i-2][0];
                dp[i][1] = dp[i-1][1] + dp[i-2][1];

            }
            System.out.println(dp[arr[k]][0] + " " + dp[arr[k]][1]);
        }



    }

}
