package wiproday2;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();  

        
        cities.add("Bangalore");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Mumbai"); 

        
        System.out.println("HashSet Elements: " + cities);

        
        String checkCity = "Delhi";
        if (cities.contains(checkCity)) {
            System.out.println(checkCity + " exists in the set.");
        } else {
            System.out.println(checkCity + " does not exist in the set.");
        }

        
        cities.remove("Chennai");
        System.out.println("Updated HashSet: " + cities);
    }
}
