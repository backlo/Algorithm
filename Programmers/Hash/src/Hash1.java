import java.util.HashMap;

public class Hash1 {

    public static String solution(String[] participant, String[] completion) {

        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        //getOrDefault 키값이 없다면 입력시 설정한 defaultvalue값 출력
        for (String player : participant)
            map.put(player, map.getOrDefault(player, 0) + 1);

        for (String player : completion)
            map.put(player, map.get(player) - 1);

        //hashmap전체 출력
        for (String key : map.keySet()) {
            if (map.get(key) != 0)
                answer = key;
        }

        return answer;
    }

    public static void main(String[] args) {

        String answer = solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        System.out.println(answer);

    }
}
