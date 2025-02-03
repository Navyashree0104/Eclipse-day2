package wiproday2;

abstract class Employee {
	String name;
	int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	abstract double calculateSalary();
	abstract void displayDetails();
}

class FullTimeEmployee extends Employee {
	double monthlySalary;
	
	public FullTimeEmployee(String name, int id, double monthlySalary) {
		super(name, id);
		this.monthlySalary = monthlySalary;
		
	}
	@Override
	double calculateSalary() {
		return monthlySalary;
		
	}
	
	@Override
	void displayDetails() {
		System.out.println("Full-Time employee");
		System.out.println("Name:" + name + ", ID: " +id);
		System.out.println("Salary: $" + calculateSalary());
		System.out.println("-------------------");
		
	}
}

class PartTimeEmployee extends Employee {
	double hourlyRate;
	int hoursWorked;
	
	public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	double calculateSalary() {
		return hourlyRate * hoursWorked;
	}
	
	@Override
	void displayDetails() {
		System.out.println("Part-Time employee");
		System.out.println("Name: " + name +", ID: " +id);
		System.out.println("Salary: $" + calculateSalary());
		System.out.println("-----------------");
		
	}
}

public class EmployeeManagement {
	public static void main(String[] args ) {
		Employee emp1 = new FullTimeEmployee("Alice", 101, 5000);
        Employee emp2 = new PartTimeEmployee("Bob", 102, 20, 80);

        Employee[] employees = {emp1, emp2};

        for (Employee emp : employees) {
            emp.displayDetails();
		
	 }
	}

}
