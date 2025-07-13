import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class MissingNUm {
    public static int missingNumBrute(int[] arr){
        for(int i = 0 ; i <= arr.length ; i++){
            int flag = 0 ;
            for(int j = 0 ; j <= arr.length; i++){

                if(arr[j] == i){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
               return i;
            }

        }
return -1;
    }

    public static int missingNumBetter(int[] arr, int n){
        boolean[] hash = new boolean[n+1];
        for(int num:arr){
            hash[num]=true;
        }

        for(int i =1; i < n; i++){
            if(hash[i]== false){
                    return i;
            }
        }
return  -1;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = sc.nextInt();

//        missingNumBrute(arr);

        int result = missingNumBetter(arr , n);
        System.out.println("the missing num using better approach is:"+ result);




    }
}
