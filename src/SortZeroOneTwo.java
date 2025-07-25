import java.util.Arrays;
import java.util.Scanner;
public class SortZeroOneTwo {
    public static void sort012Better(int[] nums ) {
        int n = nums.length;
        int cntzero = 0 ;
        int cntone = 0 ;
        int cnttwo = 0 ;
        //count all the 0's, 1's, and 2's in the array
        for(int i = 0 ; i < n ; i++){
            if(nums[i]== 0 ){
                cntzero++;
            } else if(nums[i]== 1){
                cntone++;
            }else {
                cnttwo ++;
            }
        }

        for(int i = 0 ; i < cntzero ; i++){
            nums[i] = 0 ;
        }
        for(int i = cntzero ; i < cntzero + cntone; i++){
            nums[i]= 1;
        }
        for(int i = cntzero+cntone ; i < n ; i++){
            nums[i] = 2;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        sort012Better(arr);
        System.out.println(args);
    }
}
