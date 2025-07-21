
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


//Calculator class demonstrating method overloading
class Calculator {

 // Method to add two integers
 public int add(int a, int b) {
     System.out.println("Adding two integers:");
     return a + b;
 }

 // Overloaded method to add two doubles
 public double add(double a, double b) {
     System.out.println("Adding two doubles:");
     return a + b;
 }
}

//Main class to test the calculator
public class CalculatorUsingMethodOverLoading {
 public static void main(String[] args) {
     Calculator calc = new Calculator();

     int sumInt = calc.add(10, 20);           // Calls add(int, int)
     double sumDouble = calc.add(5.5, 7.3);    // Calls add(double, double)

     // Output the results
     System.out.println("Sum (int): " + sumInt);
     System.out.println("Sum (double): " + sumDouble);
 }
}




