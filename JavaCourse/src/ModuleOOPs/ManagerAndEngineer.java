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



//Base class Employee
class Employee {
 protected String name;

 public Employee(String name) {
     this.name = name;
 }

 // Method to be overridden
 public void work() {
     System.out.println(name + " is working.");
 }
}

//Subclass Manager that overrides work()
class Manager extends Employee {

 public Manager(String name) {
     super(name);
 }

 @Override
 public void work() {
     System.out.println(name + " is managing team and projects.");
 }
}

//Subclass Engineer that overrides work()
class Engineer extends Employee {

 public Engineer(String name) {
     super(name);
 }

 @Override
 public void work() {
     System.out.println(name + " is developing software and fixing bugs.");
 }
}

//Main class to test the program
public class ManagerAndEngineer {
 public static void main(String[] args) {
     // Creating employee objects
     Employee manager = new Manager("Alice");
     Employee engineer = new Engineer("Bob");

     // Demonstrating method overriding
     manager.work();     // Calls Manager's work()
     engineer.work();    // Calls Engineer's work()
 }
}



