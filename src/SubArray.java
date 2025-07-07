public class SubArray {
    public static void printSubArray(int arr[] ){
        int count = 0 ;

        for(int i = 0; i< arr.length; i++){
            for(int j = i ; j<arr.length; j++){
                int sum = 0 ;
                for(int k = i; k <= j ; k++){
                   sum = sum + arr[k];

                }
                System.out.println(sum);
                System.out.println();
                count ++;
            }
        }
        System.out.println();
        System.out.println("the count is:"+ count);
    }

    public static void main(String[] args){
        int[] num = {1,2,3,4};
        printSubArray(num);
    }
}