import java.util.*;
public class loopsQ2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int evesum =0 ;
        int oddsum = 0;

         for(int i=1; i<=10; i++){
             if(i%2 == 0){
                 evesum += i;
             } else {
                 oddsum += i;
             }
         }
        System.out.println("Even sum ="+ evesum);
        System.out.println("odd sum ="+ oddsum);

    }
}
