import java.util.Arrays;
import java.util.Scanner;
public class FindOccurence {
    public static int[] find1andLastOccurBrute(int[] arr , int target){
        int n = arr.length;
        int first = -1;
        int last = -1;
        for(int i = 0 ; i <= n-1; i++){
            if(arr[i]==target){
                if(first == -1){
                    first = i;

                }
                last = i;
            }
        }
        return new int[] {first , last};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int target = sc.nextInt();

        int[] result  = find1andLastOccurBrute(arr, target);
        System.out.println("the first and last occurence of the target value is:"+ result[0]  +" and "+ result[1]);
    }
}
