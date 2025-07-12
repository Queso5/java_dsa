import java.util.*;
public class UnoionSortedArray {
    public static int[] printUnionBrute(int[] arr1 , int[] arr2){
        Set<Integer> union = new HashSet<>();
        for(int num : arr1){
            union.add(num);
        }
        for(int num : arr2){
            union.add(num);
        }

       //converting Set<Integer> to int[]
        int[] result = new int[union.size()];
        int i = 0 ;
        for(int num: union){
            result[i++] = num;
        }

        return  result;
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,3,3,4,5};
        int[] arr2 = {2,3,4,4,5,6,6};

        int[] union = printUnionBrute(arr1, arr2);
        System.out.println(Arrays.toString(union));

    }
}
