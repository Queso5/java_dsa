import java.util.*;
public class LargestNUm {
    public static int largeNum(int[] arr){
        int largenum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){

            if(largenum < arr[i]) {
                largenum = arr[i];
            }
        }
        return largenum;
    }

    public static int getSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]< smallest){
                smallest= arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args){
        int[] numbers = {14, 20, 12, 43, 92, 63, 1,101};
        int Lnumber = largeNum(numbers);
        System.out.println("the largest number in th array is:"+Lnumber);
        int Snumber = getSmallest(numbers);
        System.out.println("the samllest number is"+ Snumber);
    }
}
