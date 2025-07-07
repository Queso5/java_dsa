import java.util.*;
public class loopQ3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number:");
        int n = sc.nextInt();
        int fact = 1;
        for(int i =1 ; i <= n ; i++){
            fact *= i;
        }
        System.out.println("the factorial is:"+ fact);
    }
}
