package wiproday2;

import java.util.*;

public class ListSetExample {
    public static void main(String[] args) {
      
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Apple");  
        myList.add("Cherry");

        System.out.println("List Elements: " + myList);

        
        Set<String> mySet = new HashSet<>();
        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Apple");  
        mySet.add("Cherry");

        System.out.println("Set Elements: " + mySet);
    }
}
