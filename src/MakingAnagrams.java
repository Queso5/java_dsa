import java.util.Scanner;

public class MakingAnagrams {
    public static int makeAnagram(String s , String t ){
        String s1 = s.toLowerCase();
        String t1 = t.toLowerCase();

        int[] counts = new int[26];
        for( char c : s1.toCharArray()){
            counts[c - 'a']++;
        }

        for( char c : t1.toCharArray()){
            counts[c - 'a']--;
        }

        int total = 0;
        for( int i : counts){
            total += Math.abs(i);
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string s:");
        String s = sc.next();
        System.out.println("Enter string t:");
        String t = sc.next();

        int result = makeAnagram(s , t);
        System.out.println(result);
    }
}
