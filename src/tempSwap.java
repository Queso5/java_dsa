public class tempSwap {
    public static void swapNum(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void main(String[] args){
        int a = 1;
        int b = 2;
        swapNum(a, b);

    }
}
