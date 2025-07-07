public class OptiMaxSubArraySum{
    public static void OptiMSS(int arr[]){
        int n = arr.length;
        int max_sum = Integer.MIN_VALUE;

        int[] prefix = new int[n + 1];
        prefix[0] = 0 ;
        for(int i = 1 ; i <= n ; i++){
            prefix[i] = prefix[i-1 ]+ arr[i-1];
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 1; j < n ; j++){
                int sum = prefix[j + 1] - prefix[i];
                System.out.println(sum);
                if( max_sum< sum ){
                    max_sum = sum;
                }
            }
        }
        System.out.println("the max sum is:"+ max_sum);
    }

    public static void Kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < arr.length; i++){
            sum = sum + arr[i];
            if(sum < 0 ) {
                sum = 0;
            }
            ms = Math.max(sum, ms);
        }
        System.out.println("max sum is:"+ ms);
    }

    public static void main(String[] args){
        int[] numbers = {1,2,3,4};
Kadanes(numbers);
    }
}
