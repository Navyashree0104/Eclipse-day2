package wiproday2;

public class PolymorphismExample {
	 public static void main(String[] args) {
	     
	     Animal myAnimal;
	     myAnimal = new Dog();
	     myAnimal.makeSound(); 

	     myAnimal = new Cat();
	     myAnimal.makeSound(); 

	     System.out.println("----------------------");

	     
	     Calculator calc = new Calculator();
	     System.out.println("Sum of 2 numbers: " + calc.add(5, 10));
	     System.out.println("Sum of 3 numbers: " + calc.add(5, 10, 15));
	     System.out.println("Sum of 2 decimal numbers: " + calc.add(5.5, 10.2));
	 }
	}
