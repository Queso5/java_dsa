import java.util.Arrays;
import java.util.Scanner;
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] arr){
        int max = 0 ;
        int cnt = 0 ;
        for(int i = 1; i < arr.length; i++){
            if(arr[i]== 1){
                cnt++;
                max= Math.max(cnt, max);
            }else {
                cnt = 0;

            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = findMaxConsecutiveOnes(arr);
        System.out.println("the max con 1's in the array are:"+ result);
    }
}

