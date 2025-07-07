public class ArrayReverse {
    public static void reverse(int arr[]){
        int start = 0 ;
        int end = arr.length-1;

        while(start < end){
            int temp = arr[end];
             arr[end]  = arr[start];
             arr[start] = temp;
            start++;
            end--;

        }
    }
    public static void main(String[] args){
        int[] num = {2,4,6,8,10};
        reverse(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
