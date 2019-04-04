import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1463 {

    private static int Min(int num1, int num2){
        return (num1 < num2 ? num1 : num2);
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int d[] = new int[n+1];

        d[0] = d[1] = 0;

        for(int i = 2 ; i <= n ; i++){
            d[i] = d[i-1] + 1;
            if(i%3 == 0){
                d[i] = Min(d[i],d[i/3]+1);
            }
            if(i%2 == 0){
                d[i] = Min(d[i],d[i/2]+1);
            }
        }

        System.out.println(d[n]);
    }

}
