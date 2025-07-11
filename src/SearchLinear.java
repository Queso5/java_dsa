import java.util.*;
import java.util.Arrays;

public class SearchLinear {
    public static int linearSearch(int[] arr, int key){
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int key = sc.nextInt();

        int result = linearSearch(arr, key);
        System.out.println("element found at:"+ result);

    }
}
