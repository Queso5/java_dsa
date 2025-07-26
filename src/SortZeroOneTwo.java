import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
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

    public static void sort012Optimal(ArrayList<Integer> arr , int n ){
        int low = 0 ;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            if(arr.get(mid) == 0){
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid , temp);
                mid++;
                low++;
            } else if(arr.get(mid) == 1){
                mid++;
            }else {
                int temp = arr.get(mid);
                arr.set(mid , arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }



    public static void main(String[] args){
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sort012Optimal(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }

}

