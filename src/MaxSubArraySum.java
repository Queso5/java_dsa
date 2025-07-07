public  class MaxSubArraySum{
    public static void printMaxSum(int[] arr){
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i ; j < arr.length; j++){
                int sum = 0 ;

                for(int k = i ; k <= j ; k++){
                    sum = sum + arr[k];
                    if(max_sum < sum){
                        max_sum = sum;
                    }
                }
                System.out.println(sum);

            }
        }
        System.out.println("the max sum is:"+ max_sum);
    }

    public static void main(String[] args){
        int[] numbers = {1,2,3};
        printMaxSum(numbers) ;
    }
}