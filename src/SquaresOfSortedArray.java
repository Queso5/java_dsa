import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] sortedSquaresOptimal(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int i = 0;
        int j = n-1;
        int k = n-1;
        while( i <= j){
            int leftSq = nums[i]*nums[i];
            int rightSq = nums[j]*nums[j];

            if(leftSq > rightSq){
                result[k] = leftSq;
                k--;
                i++;
            } else {
                result[k] = rightSq;
                k--;
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2 , -4, 5};
        int[] res = sortedSquaresOptimal(arr);
        for(int i = 0 ; i < res.length; i++){
            System.out.print(res[i]+ " ");
        }
    }
}
