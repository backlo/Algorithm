import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws  Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] weight = new int[n];

        for(int i = 0 ; i < n ; i++){
            weight[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(weight);
        int answer = 0;
        for(int i = 0; i < weight.length ; i++){
            int tmp = weight[i]*(n-1);
            if(answer < tmp){
                answer = tmp;
            }
        }

        System.out.println(answer);

    }
}
