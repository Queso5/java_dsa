import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicatedElements {
    public static int removeDuplicatesArray(int[] nums){
        int i = 0 ;
        for(int j = 1 ; j < nums.length; j++ ){
            if(nums[j]!= nums[i]){
                nums[i+1]= nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr= Arrays.stream(sc.nextLine().split(" ,"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = removeDuplicatesArray(arr);
        System.out.println("the length of new array is:"+ result);

    }

}
