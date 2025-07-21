import java.util.Arrays;
import java.util.Scanner;

public class FloorandCeil {
    public static int floor(int[] arr , int target){
        int n = arr.length;
        int low = 0 ;
        int high = n -1;
        int ans = -1;
        while(low <= high){
            int mid = ((low+high))/2;
            if(arr[mid]<=target){
                ans = arr[mid];
                low = mid+1;
            }else {
                high = mid - 1;
            }

        }
        return ans;
    }

    public static int ceil(int[] arr , int target){
        int n = arr.length;
        int low = 0 ;
        int high = n -1;
        int ans = -1;
        while(low <= high){
            int mid = ((low+high))/2;
            if(arr[mid]>=target){
                ans = arr[mid];
                high = mid-1;
            }else {
                low = mid + 1;
            }

        }
        return ans;
    }

    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an array:");
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.print("Entere a target:");
        int target = sc.nextInt();

        int resultfloor = floor(arr , target);
        int resultceil = ceil(arr, target);
        System.out.println(" the floor and the ceil for the target is:"+ resultfloor + "and"+ resultceil);
    }
}
