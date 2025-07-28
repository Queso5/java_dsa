import java.util.HashMap;
import java.util.HashSet;

public class HashingBaics {
    public static void main(String[] args){
        //defining a HashSet
        HashSet<Integer> myHashSet = new HashSet<>();

        //operations on HashSet
        // - adding elements to the hashSet
        myHashSet.add(12);
        myHashSet.add(13);

        //search elements in the hashSet
        myHashSet.contains(12);


        //remove elements from hashSet
//        myHashSet.remove(13);

        //iterate thru a HashSet
        int iter = myHashSet.iterator().next();
        System.out.println(iter);


        //HasMap

        //defining a HashMap
        HashMap<String, Integer> myHashMap = new HashMap<>();

        // inset in hashMap
        myHashMap.put("Mango" , 50 );
        myHashMap.put("apple", 30);
        myHashMap.put("banana", 20);

        System.out.println(myHashMap);

        //removing an element from the hashmap
        myHashMap.remove("banana" );
        System.out.println(myHashMap);

        //check is key present;
        if(myHashMap.containsKey("peach")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


    }
}
