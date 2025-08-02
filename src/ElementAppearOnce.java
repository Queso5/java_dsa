import java.util.Arrays;
import java.util.Scanner;
public class ElementAppearOnce {
    public static int printEleAppearOnceBrute(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            int num = arr[i];
            int cnt = 0;
            for(int j = 0 ; j < n ; j++){
                if(arr[j]== num){
                    cnt ++;                }
            }
            if(cnt == 1){
                return  i ;
            }
        }
        return -1;
    }

    public static int printEleAppearOnceBetter(int[] arr){
        int max = 0 ;
        for(int i = 0 ; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }





        int[] hash = new int[max+1];

        for(int num: arr ){
            hash[num]++;
        }

        for(int i = 0 ; i < arr.length; i++){
            if(hash[i]==1){
                return  i;
            }

        }
        return -1;
    }

    public static int printEleAppearOnceOptimal(int[] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = printEleAppearOnceOptimal(arr);
        System.out.println("the element thta appears once is:"+ result);
    }
}
