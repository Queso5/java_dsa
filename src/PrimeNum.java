import java.util.*;
public class PrimeNum {
    public static void main(String[] arsgs){
        Scanner sc = new Scanner(System.in);
        boolean isPrime = true;
        System.out.print("Enter you number");
        int n = sc.nextInt();
        if(n <= 1){
            isPrime= false;
        }else {
            for(int i = 2; i <= n-2; i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
        }
        System.out.println(isPrime);
    }
}
