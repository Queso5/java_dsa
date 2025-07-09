import java.util.Arrays;
import java.util.Scanner;
public class RotateArrayByK {
    public static void rotateArray(int[] nums ){

        int temp = nums[0];
        for(int i = 1; i < nums.length ; i++){
            nums[i-1]= nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                                .toArray();

         rotateArray(arr);
    }
}
