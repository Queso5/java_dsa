public class ArrayPairs {
    public static void arrPairs(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            for(int j = i ; j< arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }


    }
    public static void main(String[] args){
        int[] numbers = {1,2,3,4};
        arrPairs(numbers);
    }
}