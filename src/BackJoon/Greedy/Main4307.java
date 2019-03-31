package BackJoon.Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main4307 {

    private static int shortDistance(int[] ant, int length){
        int half = length/2;
        int location = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0 ; i<ant.length ; i++){
            int abs = Math.abs(ant[i] - half);
            if(min > abs){
                min = abs;
                location = ant[i];
            }
        }

        if(location <= half){
            return location;
        }

        return (length-location);
    }


    private static int longDistance(int[] ant, int length){
        int half = length/2;
        int location = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<ant.length ; i++){
            int abs = Math.abs(ant[i] - half);
            if(max < abs){
                max = abs;
                location = ant[i];
            }
        }

        if(location >= half){
            return location;
        }

        return (length-location);
    }


    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ;i < n ; i++){
            String[] index = br.readLine().split(" ");
            int length = Integer.parseInt(index[0]);
            int num = Integer.parseInt(index[1]);
            int[] ant = new int[num];

            for(int j = 0 ; j < num ; j++){
                ant[j] = Integer.parseInt(br.readLine());
            }

            System.out.println(shortDistance(ant, length) + " " + longDistance(ant, length));
        }


    }
}
