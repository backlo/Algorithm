import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int sum=0;
        String[] index = br.readLine().split(" ");

        for(int i = 0 ; i < n ; i++){
            arr[i] = Integer.parseInt(index[i]);
        }

        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length ; i++){
            int p = n-i;
            sum += arr[i]*p;
        }

        System.out.println(sum);

    }
}
