package wiproday2;

import java.util.*;

@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

public class LambdaSortingExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        
        names.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println("Sorted List in Reverse Order: " + names);

        
        StringProcessor toUpperCaseProcessor = String::toUpperCase;

        
        names.forEach(name -> System.out.println(toUpperCaseProcessor.process(name)));
    }
}

