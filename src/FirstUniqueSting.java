import java.util.HashMap;
import java.util.Map;

public class FirstUniqueSting {
    public static int findFirstUniqStrBrute(String s){
        int n = s.length();
        int ansIndex = 0;
        for(int i = 0 ; i < n ; i++){

            int charCnt = 0 ;
            for(int j = 0 ; j < n ; j++){
                if(s.charAt(j) == s.charAt(i)){
                    charCnt++;
                }
            }

            if(charCnt == 1){
                return i;
            }

        }
        return -1;
    }

    public static int findFirstUniqStrBetter(String str){
        Map<Character , Integer> charFreqMap = new HashMap<>();

        //interating thru the string and adding it to the hasMap;
        for(int i = 0 ; i < str.length(); i++){
            char c = str.charAt(i);
            charFreqMap.put(c, charFreqMap.getOrDefault(c,0) + 1);
        }

        //loopoing thru the str and checking a character inthe map with only 1 occurence
        for(int i = 0 ; i < str.length(); i++){
            if(charFreqMap.get(str.charAt(i)) == 1){
                return i;
            }
        }
return -1;

    }

    public static void main(String[] args) {
        String str = "aabbc";
        int result = findFirstUniqStrBetter(str);
        System.out.println(result);
    }
}
