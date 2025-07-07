import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you name:");
        String name = sc.nextLine();
        System.out.println(name);
}
}
