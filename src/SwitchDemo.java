import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you grade:");
        char grade = sc.next().charAt(0);

        switch(grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("good");
                break;
            case 'C':
                System.out.println("keep working");
                break;
            default:
                System.out.println("invalid input");
                break;
        }
    }
}
