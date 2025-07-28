import java.util.*;
public class LongestConsecutiveSeq {
    public static boolean LinearSearch(int[] nums , int x){
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == x){
                return true;
            }
        }
        return false;
    }

    public static int findLongestConsSeqBrute(int[] nums){
        int longest = 1;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++ ){
            int x = nums[i];
            int cnt = 0 ;
            while(LinearSearch(nums , x ) == true){
                x = x + 1;
                cnt = cnt + 1;
                longest = Math.max(cnt , longest);
            }

        }
        return longest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = findLongestConsSeqBrute(arr);
        System.out.println(result);
    }
}
