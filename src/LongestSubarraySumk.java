import java.util.Arrays;
import java.util.Scanner;
public class LongestSubarraySumk {
    public static int longSubArrSumKBrute(int[] arr, int k ){
        int n = arr.length;
        int len = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                long sum = 0;
                for(int  l = i ; l <= j ; l++){
                    sum += arr[l];
                }
                if( sum ==  k){
                    len = Math.max(len , j-i+1);
                }
            }
        }
        return  len;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an array");
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.print("Enter the value for k:");
        int k = sc.nextInt();

        int result = longSubArrSumKBrute(arr, k);
        System.out.println("the len of longest subarray with sum k is:"+ result);

    }
}
