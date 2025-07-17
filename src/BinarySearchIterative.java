import java.util.Arrays;
import java.util.Scanner;
public class BinarySearchIterative {
    public static int binarySearch(int[] arr , int key){
        int n = arr.length;
        int low = 0 ;
        int high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return mid;
            } else if (key > arr[mid]) {
                low = mid+1;
            }else  {
                high = mid - 1;
            }
        }
        return  -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array:");
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.print("enter a key:");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);
        System.out.println("the element found at index:"+ result);

    }
}
