public class isPrime {
    public static boolean prime(int n){
        //corner cases
        if(n == 2){
            return true;
        }
        for(int i =2; i <= n-1; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int n = 12;
        System.out.println(prime(n));
    }
}
