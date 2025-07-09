import java.util.Arrays;
import java.util.Scanner;
public class RotateElementsByKBrute {
    public static void rotateElementsBrute(int nums[], int d){
        int n = nums.length;
        d = d % n;
        int[] temp = new int[d];
        for(int i = 0 ; i < d ; i++){
            temp[i] = nums[i];
        }

        for(int i = d; i < n; i++){
            nums[i - d] = nums[i];
        }

        for (int i = 0; i < d; i++) {
            nums[n - d + i] = temp[i];
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.print("Enter value for d:");
        int d = sc.nextInt();

        rotateElementsBrute(arr, d);

        System.out.println(Arrays.toString(arr));

    }
}
