import java.util.Arrays;

public class ArrayDemo2 {
    public static String linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(key)) {
                return arr[i];
            }


        }
        return "not found";
    }

    public static void main (String[]args){
        String[] menu = {"dosa", "sandwhich", "pastry", "choclate", "shake"};
        String find = "samosa";
        String found = linearSearch(menu,find);
        System.out.println(found);
    }
}