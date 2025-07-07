public class checkFuncOverload {
    public static double sum(double num1, double num2){
        double result = num1+ num2;
        return result;
    }

    public static int sum(int n1 , int n2, int n3){
        int result = n1 + n2 + n3;
        return result;
    }

    public static void main(String[] args){
        double a = 1.0;
        double b = 2.0;
        System.out.println(sum(a , b));
        int c = 1;
        int d = 2;
        int e = 3;
        System.out.println(sum(c, d, e));
    }
}
