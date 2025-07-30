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



}
