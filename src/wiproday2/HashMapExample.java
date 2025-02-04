package wiproday2;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>(); 

       
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Eve");

        
        int searchRoll = 103;
        System.out.println("Student with Roll No " + searchRoll + ": " + students.get(searchRoll));

        
        students.remove(104); 

        
        System.out.println("Updated Student Records:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}

