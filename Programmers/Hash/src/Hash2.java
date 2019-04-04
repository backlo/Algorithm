import java.util.Arrays;

public class Hash2 {

    public static boolean solution(String[] phone_book) {

        //정렬해서
        Arrays.sort(phone_book);

        //포문 한번만 (정렬되기때문에 컨테인 써도 됌)
        for(int i = 0 ; i < phone_book.length-1 ; i++){
            //앞뒤로 비교 <-정렬을 해줬기 때문에
            if(phone_book[i+1].contains(phone_book[i])){
                return false;
            }
        }

        return true;

       /* for(int i = 0 ; i < phone_book.length ; i++){
            String phoneData = phone_book[i];
            for(int j = 0 ; j < phone_book.length ; j++){
                if(i==j) continue;
                if(phoneData.startsWith(phone_book[j])){
                    return false;
                }
            }
        }

        return true;*/
    }

    public static void main(String[] args){

        boolean answer = solution(new String[]{"119", "97674223", "1124421119"});
        System.out.print(answer+"");
    }
}
