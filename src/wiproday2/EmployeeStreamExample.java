package wiproday2;

import java.util.*;
import java.util.stream.Collectors;

class Employe {
    String name;
    int age;
    double salary;

    public Employe(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }
}

public class EmployeeStreamExample {
    public static void main(String[] args) {
        List<Employe> employees = Arrays.asList(
            new Employe("Alice", 28, 50000),
            new Employe("Bob", 35, 60000),
            new Employe("Charlie", 40, 75000),
            new Employe("David", 25, 48000),
            new Employe("Eve", 32, 70000)
        );

        
        List<Employe> filteredEmployees = employees.stream()
                .filter(emp -> emp.getAge() > 30)
                .collect(Collectors.toList());

        
        List<String> names = filteredEmployees.stream()
                .map(Employe::getName)
                .collect(Collectors.toList());

       
        double averageSalary = filteredEmployees.stream()
                .mapToDouble(Employe::getSalary)
                .average()
                .orElse(0.0);

        System.out.println("Employees older than 30: " + names);
        System.out.println("Average Salary: " + averageSalary);
    }
}

