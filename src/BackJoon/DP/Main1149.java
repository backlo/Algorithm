package BackJoon.DP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1149 {

    private static int Min(int num1, int num2){
        return (num1 < num2 ? num1 : num2);
    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n+1][3];
        int d[][] = new int [n+1][3];

        arr[0][0] = arr[0][1] = arr[0][2] = d[0][0] = d[0][1] = d[0][2] = 0;

        for(int i = 1 ; i <= n ; i ++){
            String[] index = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(index[0]);
            arr[i][1] = Integer.parseInt(index[1]);
            arr[i][2] = Integer.parseInt(index[2]);
        }

        for(int i = 1; i <= n ; i++){
            d[i][0] = Min(d[i-1][1], d[i-1][2]) + arr[i][0];
            d[i][1] = Min(d[i-1][0], d[i-1][2]) + arr[i][1];
            d[i][2] = Min(d[i-1][0], d[i-1][1]) + arr[i][2];
        }

        System.out.println( Min( Min(d[n][0] , d[n][1]) , d[n][2]));


    }

}

