import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HashingBaics {
    public static void main(String[] args){
        //import HashSet
        //import Iterator
        //does not contain duplicates
        //defining a set
        HashSet<Integer> mySet = new HashSet<>();


        //add elements to the set
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(1);


        //get the size of the set
        System.out.println(mySet.size());

        System.out.println(mySet);

        //search for elements
        System.out.println(mySet.contains(1));

        //remove elements
        mySet.remove(1);

        //iteraton
        Iterator it = mySet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }






















//        //HasMap
//
//        //defining a HashMap
//        HashMap<String, Integer> myHashMap = new HashMap<>();
//
//        // inset in hashMap
//        myHashMap.put("Mango" , 50 );
//        myHashMap.put("apple", 30);
//        myHashMap.put("banana", 20);
//
//        //if the key is alrady present in the hashmap the value of the key will be updated
//
//        System.out.println(myHashMap);
//
//        //removing an element from the hashmap
//        myHashMap.remove("banana" );
//        System.out.println(myHashMap);
//
//        //check is key present;
//        if(myHashMap.containsKey("peach")){
//            System.out.println("true");
//        }else {
//            System.out.println("false");
//        }
//
//        //get the value of a key
//        System.out.println(myHashMap.get("Mango"));
//        //if the key doesnt exist it will return null
//
//
//        //how to directly iterate between the value of the array
//        int[] arr = {1 ,2,3,4,5,6};
//        for(int val : arr){
//            System.out.println(val + " "); // only access the values of the arr not the index
//        }
//
//
//        HashMap<String, Integer> mpp = new HashMap<>();
//        mpp.put("India", 12);
//        mpp.put("USA", 10);
//        mpp.put("China", 9);
//
//        for(Map.Entry<String, Integer> it : mpp.entrySet()){
//            System.out.println(it.getKey());
//            System.out.println(it.getValue());
//        }
//        mpp.remove("China");
//        System.out.println(mpp);
//


    }
}
