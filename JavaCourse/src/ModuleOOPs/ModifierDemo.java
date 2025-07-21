
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
strictfp class ModifierDemo {
	//strictfp class: Enforces consistent floating-point calculations
	
	

		// final constant variable
		public static final double PI = 3.14159;

		// static variable shared across all instances
		static int counter = 0;

		int tempData;

		boolean isRunning = true;

		// Constructor
		public ModifierDemo() {
			counter++; // Increase static counter
		}

		// synchronized method: Only one thread at a time
		public synchronized void syncMethod() {
			System.out.println("Synchronized method executed by thread: " + Thread.currentThread().getName());
		}

		// final method: Cannot be overridden
		public final void displayFinalMessage() {
			System.out.println("This is a final method.");
		}

		// main method to demonstrate everything
		public static void main(String[] args) {
			ModifierDemo demo = new ModifierDemo();
			demo.syncMethod();
			demo.displayFinalMessage();

			// Accessing static variable
			System.out.println("Static counter: " + ModifierDemo.counter);

			// Using abstract class and method
			Shape shape = new Circle();
			shape.draw();
		}
	}

	//abstract class with abstract method
	abstract class Shape {
		protected String name = "Shape"; // protected variable

		// abstract method to be implemented by subclass
		public abstract void draw();
	}

	//final class: cannot be extended
	final class Circle extends Shape {
		@Override
		public void draw() {
			System.out.println("Drawing a circle.");
		}
	}




