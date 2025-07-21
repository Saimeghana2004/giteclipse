
/*
 * Objective: Demonstrate Encapsulation
 * Contents: Class: Bank Account And Bank App(contains main function)
 *   Bank Account contains Construnctor, getBalance(), Deposit(),Witdraw() and variable balance.
 * Example Taken: Bank App to perform Deposit, Withdraw and Check Balance
 * Objective Achieved using:
 * balance is declared private, so it cannot be accessed or modified directly from outside the class.
 * Access is provided through public methods (deposit(), withdraw(), and getBalance()), 
 * which control how the data is accessed or modified.
 * This protects the integrity of the data and allows validation logic (like checking for negative amounts).
 * 
 */
package ModuleOOPs;


//Base class Animal
class Animal {
 // Method to be overridden
 public void makeSound() {
     System.out.println("Some generic animal sound");
 }
}

//Subclass Dog
class Puppy extends Animal {
 @Override
 public void makeSound() {
     System.out.println("Dog says: Woof! Woof!");
 }
}

//Subclass Cat
class Cat extends Animal {
 @Override
 public void makeSound() {
     System.out.println("Cat says: Meow!");
 }
}

//Subclass Cow
class Cow extends Animal {
 @Override
 public void makeSound() {
     System.out.println("Cow says: Moo!");
 }
}

//Main class to test polymorphic behavior
public class AnimalSoundSimulator {
 public static void main(String[] args) {
     // Polymorphic references
     Animal myDog = new Puppy();
     Animal myCat = new Cat();
     Animal myCow = new Cow();

     // Calling overridden methods
     myDog.makeSound();
     myCat.makeSound();
     myCow.makeSound();
 }
}



