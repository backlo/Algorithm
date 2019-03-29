import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution7102 {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.valueOf(br.readLine());
        int index[] = new int[2];
        int count=1;

        for(int i = 0 ; i < testcase ; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j = 0 ; j< index.length ; j++){
                index[j] = Integer.parseInt(st.nextToken());
            }

            if(index[0] > index[1]){
                int ab = index[0]-index[1]+1;
                int arr[] = new int[ab];
                String answer = "";

                for(int j = 0; j<arr.length ; j++){
                    arr[j] = 1 + index[1] + j ;
                    answer += " " + arr[j];
                }
                System.out.println("#"+ (count++) + answer);

            } else if(index[0] == index[1]){
                System.out.println("#"+(count++) + " " + (1+index[0]));
            } else{
                int ab = index[1]-index[0]+1;
                int arr[] = new int[ab];
                String answer = "";

                for(int j = 0; j<arr.length ; j++){
                    arr[j] = 1 + index[0] + j ;
                    answer += " " + arr[j];
                }

                System.out.println("#"+(count++) + answer);
            }
        }
    }
}
