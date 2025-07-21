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

public class AbstractDemo {
	public static void main(String[] args) {
		Dog myDog = new Dog("Buddy");
		myDog.makeSound();
		myDog.animalsleep();
	}

}

abstract class MyAnimal {
	String name;

	MyAnimal(String name) {
		this.name = name;
	}

	// Abstract method (no body)
	abstract void makeSound();

	// Concrete method
	void  animalsleep() {
		System.out.println(name + " is sleeping.");
	}
}

// Subclass
class Dog extends MyAnimal {

	Dog(String name) {
		super(name);
	}

	// Implementation of abstract method
	void makeSound() {
		System.out.println(name + " says: Woof!");
	}
}



