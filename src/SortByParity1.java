import java.util.*;
public class SortByParity1 {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int evenindex = 0 ;
        for(int i = 0 ; i < n ;i++){
            if(nums[i] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[evenindex];
                nums[evenindex] = temp;
                evenindex++;
                }
            }
            return  nums;
        }

    public static int[] sortArrayByParityBetter(int[] nums){
        int low = 0 ;
        int high = 0;
        int n = nums.length;
        while(high < n){
            if(nums[high] %2 != 0){
                high++;
            }
            if(nums[high] % 2 == 0){
                // Swap nums[low] and nums[high]
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
            }
            high++;

        }
        return nums;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] result = sortArrayByParityBetter(arr);
        for(int i = 0 ; i < result.length; i++){
            System.out.print(result[i]+ " ");
        }
    }



}
