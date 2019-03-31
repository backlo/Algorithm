package BackJoon.Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main11047 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] index = br.readLine().split(" ");

        int n = Integer.parseInt(index[0]);
        int k = Integer.parseInt(index[1]);

        int[] coin = new int[n];
        int answer = 0;

        for(int i = 0 ; i < n ; i++){
            int kind = Integer.parseInt(br.readLine());
            coin[i] = kind;
        }

        for(int i = n-1 ; i >= 0 ; i--){
            if(k >= coin[i]){
                answer += k/coin[i];
                k = k%coin[i];
            }
            if(k == 0){
                break;
            }
        }

        System.out.println(answer);

    }
}
