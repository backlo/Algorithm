import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2579 {

    private static int Max(int num1, int num2) {
        return (num1 > num2 ? num1 : num2);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n + 1];
        int d[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        d[1] = arr[1];
        d[2] = d[1] + arr[2];

        for (int i = 3; i <= n; i++) {
            d[i] = Max(arr[i-1] + d[i-3] + arr[i], d[i-2] + arr[i]);
        }

        System.out.println(d[n]);
    }

}
