import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {

        //**Strings are immutable**
//        char[] arr = {'a', 'b', 'c', 'd'};
//        String str  =  "abcd"; //directly definin the string array or string
//        //👇using string builder
//        String str2 = new String(("xyz"));//defines as a object
//
//        //taking String inputs
//
//        Scanner sc = new Scanner(System.in);
//        String name ;
//        //name = sc.next();//only takes single word
//        name = sc.nextLine(); //takes full input including additional characters
//
//
//        System.out.println(name);



        //**string methods**

        String fullName = "tejas parate";
        System.out.println(fullName.length()); //paranthsis are used here unlike integer arrays because its a string property


        //find a character at specific index
        System.out.println(fullName.charAt(0));

        //to print all the characters in the string
        for(int i = 0 ; i < fullName.length(); i++){
            System.out.print(fullName.charAt(i));
        }






    }
}
