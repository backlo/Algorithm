import java.util.ArrayList;
import java.util.HashMap;

public class Hash4 {

    public static int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        HashMap<String, Integer> countMap = new HashMap<>();
        ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();

        for (int i = 0; i < genres.length; i++) {
            if(countMap.containsKey(genres[i])){
                countMap.replace(genres[i],countMap.get(genres[i])+plays[i]);
            } else{
                countMap.put(genres[i],plays[i]);
            }
        }

        for(int i = 0 ; i < genres.length ; i++){

        }


        return answer;
    }

    public static void main(String[] args) {
        int[] answer = solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
        for (int result : answer) {
            System.out.println(result);
        }
    }
}
