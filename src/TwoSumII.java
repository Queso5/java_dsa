public class TwoSumII {
    public static int[] gettwoSumIIBrute(int[] numbers, int target) {
        int n = numbers.length;
        for(int i = 0 ; i < n; i++){
            for (int j = i+1; j < n ; j ++){
                if(numbers[i] + numbers[j] == target){
                    return  new int[]{ i+1, j+1};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public int[] gettwoSumIIOptimal(int[] numbers, int target) {
        int n = numbers.length;
        int low = 0 ;
        int high = n -1  ;
        while( low < high){
            int sum = numbers[low] + numbers[high];
            if(sum  == target){
                return new int[] {low+1 , high+1};
            }else if(sum < target) {
                low++;
            }else{
                high--;
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2 ,3 ,4};
        int target = 6;
        int[] result = gettwoSumIIBrute(arr , target);
        for (int i = 0 ; i < arr.length; i++){
            System.out.println(result[i]);
        }

    }
}

