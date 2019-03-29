package AlgoSpot.Chap1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Festival_1 {

    public static void main(String[] args) throws Exception{

        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.valueOf(in.readLine());

        for (int i = 0 ; i< testCase ; i++){
            String n_l[] = in.readLine().split(" ");
            int n = 0;
            int l = 0;
            for(int j = 0 ; j < n_l.length ; j ++) {
                n = Integer.valueOf(n_l[0]);
                l = Integer.valueOf(n_l[1]);
            }

            String arr_text[] = in.readLine().split(" ");
            int arr[] = new int[n];

            for(int j = 0 ; j < n ; j++){
                arr[j] = Integer.valueOf(arr_text[j]);
            }

            double min = 1000;
            double sum = 0;
            int sum_cnt = 0;

            for (int j = 0; j < n; j ++) {

                for (int k = j; k < n; k ++) {
                    sum_cnt ++;
                    sum += arr[k];

                    if (sum_cnt >= l) {
                        if (min > sum/sum_cnt) {
                            min = sum/sum_cnt;
                        }
                    }
                }

                sum = 0;
                sum_cnt = 0;
            }

            System.out.printf("%.10f", min);
            System.out.println();

        }
    }

}


