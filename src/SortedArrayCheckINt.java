import java.util.*;
public class SortedArrayCheckINt {
    public static boolean checkSortedArray(int nums[]){
        for(int i=1; i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                return  true;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
int[] arr = Arrays.stream(sc.nextLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();
        boolean result = checkSortedArray(arr);
        System.out.println("the array is sorted:"+ result);
    }
}
