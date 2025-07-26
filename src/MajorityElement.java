import java.util.*;
public class MajorityElement {
    public static int findMajorityElementBrute(int[] nums){
        int N = nums.length;
        for(int i = 0 ; i < N ; i++){
            int cntr = 0 ;
            for(int j = 0; j < N ; j++){
                if(nums[i] == nums[j]){
                    cntr++;
                }
            }
            if( cntr > N/2){
                return nums[i];
            }
        }
        return -1;
    }

    //better approach

    public static int findMajorityElementBetter(int[] nums){
        int n = nums.length;
        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        //sort
        for(int i = 0 ; i <  n ; i++){
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], value+1);

        }

        //search
        for(Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if(it.getValue() > n/2){
                return it.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an array:");
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = findMajorityElementBetter(arr);
        System.out.println("the majority ele is:"+result);
    }
}
