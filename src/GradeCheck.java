import java.util.Scanner;
public class GradeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you gpa:");
        double gpa = sc.nextDouble();

        if(gpa > 9){
            System.out.println("Excellent");
        } else if (gpa > 7) {
            System.out.println("good");
        } else {
            System.out.println("fine");
        }

    }
}
