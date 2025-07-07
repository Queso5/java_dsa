import java.util.*;
public class funcFact {
    public static int fact(int n){
        int fac= 1;
        for(int i =1; i<=n ; i++){
            fac *= i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        System.out.print("Enter the value of :");
        int r = sc.nextInt();
        int n_fact = fact(n);
        int r_fact = fact(r);
        int nr_fact = fact(n-r);
        System.out.println("binomial coefficient is:"+ n_fact/(r_fact* nr_fact));

    }

}
