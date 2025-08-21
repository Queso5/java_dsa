public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String s2 = s.trim();
        int n = s2.length();
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            if (s2.charAt(i) == s2.charAt(j)) ;
            j--;
        }
        if (s.trim() == s2) {
            return true;
        }
        return  false;
    }

    public static void main(String[] args) {
        String str = "race a car";
        boolean result = isPalindrome(str);
        System.out.println(result);
    }
}