package wiproday2;




 public class Animal {
 
 void makeSound() {
     System.out.println("Some generic animal sound");
 }
}


class Dog extends Animal {
 @Override
 void makeSound() {
     System.out.println("Dog barks: Woof Woof!");
 }
}


class Cat extends Animal {
 @Override
 void makeSound() {
     System.out.println("Cat meows: Meow Meow!");
 }
}


class Calculator {

 int add(int a, int b) {
     return a + b;
 }

 int add(int a, int b, int c) {
     return a + b + c;
 }

 double add(double a, double b) {
     return a + b;
 }
}



