import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main1931{

    //vetor는 동기화 때문에 시간이 오래걸림 -> sync
    //arraylist는 동기화 안함
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<ConferenceTime> v = new ArrayList<>();
        int answer = 1;

        for(int i = 0 ; i < n ; i ++){
            String[] index = br.readLine().split(" ");
            v.add(new ConferenceTime(Integer.parseInt(index[0]),Integer.parseInt(index[1])));
        }

        Collections.sort(v);

        int endmetting = v.get(0).getEnd();

        for(int i = 1; i < v.size() ; i++){
            if(endmetting <= v.get(i).getStart()){
                endmetting = v.get(i).getEnd();
                answer++;
            }
        }

        System.out.println(answer);

    }

    private static class ConferenceTime implements Comparable<ConferenceTime>{
        int start;
        int end;

        public ConferenceTime(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        @Override
        public int compareTo(ConferenceTime o) {
            int compareEnd = o.getEnd();
            int ret = this.end - compareEnd;

            if(ret==0){
                int comparedStart = o.getStart();
                int ret2 = this.start - comparedStart;
                return ret2;
            }

            return ret;
        }
    }

}
