import java.util.*;

public class SecondLargest {
    public static int printSecondLargestNum(int[] nums) {
        int largest = nums[0];
        int secondlargest = -1;

        // Step 1: Find the largest element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        // Step 2: Find the second largest
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != largest && nums[i] > secondlargest) {
                secondlargest = nums[i];
            }
        }

        return secondlargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int second = printSecondLargestNum(arr);
        System.out.println("The second largest number is: " + second);
    }
}
