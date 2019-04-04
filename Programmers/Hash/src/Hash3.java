import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Hash3 {

    //구하는 공식 (옷종류1+1)*(옷종류2+1)-1
    public static int solution(String[][] clothes) {
        int answer = 1;

        //string 정렬 방법
        /*Arrays.sort(clothes, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                //[i][0]은 앞에 [i][1]은 뒤에 비교(2차배열에서)
                String object1 = o1[0];
                String object2 = o2[0];

                //String은 compareTo  Integer은 내림차순 : o1[1]-o2[1], 오름차순은 반대로
                return object1.compareTo(object2);
            }
        });*/

        HashMap<String,Integer> clothesMap = new HashMap<>();

        for(int i = 0 ; i < clothes.length ; i++){
            if(clothesMap.containsKey(clothes[i][1])){
                //대체해서 value값을 플러스 1해줌
                clothesMap.replace(clothes[i][1], clothesMap.get(clothes[i][1])+1);
            }
            else{
                //새로운거면 그냥 1집어넣어줌
                clothesMap.put(clothes[i][1], 1);
            }
        }

        // 곱해주는 부분
        for(String data : clothesMap.keySet()){
            answer *= (clothesMap.get(data)+1);
        }

        // 하나도 안입는건 없기에 -1 해줌
        return (answer-1);
    }

    public static void main(String[] args){

        int answer = solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});
        System.out.println(answer+"");
    }
}
