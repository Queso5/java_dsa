import java.util.Scanner;
public class userinputloop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();

        int counter = 1;
        while(counter <= n){
            System.out.println(counter);
            counter++;
        }

    }
}
