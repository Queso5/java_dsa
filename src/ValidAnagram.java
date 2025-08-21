
import java.util.HashMap;
import  java.util.Scanner;

public class ValidAnagram {
    public static boolean findValidAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        String s1 = s.toLowerCase();
        String t1 = t.toLowerCase();

        HashMap<Character, Integer> charFreqMap = new HashMap<>();

        for( char c : s1.toCharArray()){
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0)+1);
        }

        for(char c : t1.toCharArray()){
            if(!charFreqMap.containsKey(c)){
                return false;
            }
            charFreqMap.put(c , charFreqMap.get(c) -1);
            if( charFreqMap.get(c) < 0){
                return false;
            }
        }
        return  true;
    }

    public static boolean isAnagramBetter(String s , String t){
        String s1 = s.toLowerCase();
        String t1 = t.toLowerCase();

        //initializing bucked arary
        int[] counts = new int[26];

        //adding character of s to bucked;
        for(int i = 0 ; i < s.length(); i++){
            counts[s.charAt(i) - 'a']++;
        }

        //remove from bucked array if present in t
        for(int i = 0 ; i < t.length(); i++){
            counts[t.charAt(i) - 'a']--;
        }

        for (int count : counts){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s:");
        String s = sc.next();
        System.out.println("Enter string t:");
        String t = sc.next();

        boolean result = isAnagramBetter( s , t);
        System.out.println(result);
    }
}
