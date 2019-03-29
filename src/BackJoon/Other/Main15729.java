package BackJoon.Other;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main15729 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());
        String index[] = br.readLine().split(" ");
        int count=0;

        for(int i = 0; i < n ; i++){
            if(index[i].equals("1")){
                index[i]="0";
                count++;
                if((i+1)>=n){
                    continue;
                }
                if(index[i+1].equals("1")){
                    index[i+1]="0";
                } else{
                    index[i+1]="1";
                }

                if((i+2)>=n){
                    continue;
                }
                if(index[i+2].equals("1")){
                    index[i+2]="0";
                } else{
                    index[i+2]="1";
                }

            }
        }

        System.out.print(count);

    }
}
