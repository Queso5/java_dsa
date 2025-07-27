import java.util.ArrayList;
import java.util.List;

public class SumOfUnqEle {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n+1];
        List<Integer> result = new ArrayList<>();


        for(int num : nums){
            freq[num]++;
        }

        for(int i = 1; i <= n ; i++){
            if(freq[i] == 2){
                result.add(i);
            }
        }
        return result;
    }
}
