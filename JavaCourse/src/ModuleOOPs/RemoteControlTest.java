

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
//Define the Remote interface
interface Remote {
 void turnOn();   // Method to turn on the device
 void turnOff();  // Method to turn off the device
}

//TV class implementing Remote interface
class TV implements Remote {
 @Override
 public void turnOn() {
     System.out.println("TV is turned ON.");
 }

 @Override
 public void turnOff() {
     System.out.println("TV is turned OFF.");
 }
}

//Fan class implementing Remote interface
class Fan implements Remote {
 @Override
 public void turnOn() {
     System.out.println("Fan is turned ON.");
 }

 @Override
 public void turnOff() {
     System.out.println("Fan is turned OFF.");
 }
}

//AC class implementing Remote interface
class AC implements Remote {
 @Override
 public void turnOn() {
     System.out.println("AC is turned ON.");
 }

 @Override
 public void turnOff() {
     System.out.println("AC is turned OFF.");
 }
}

//Main class to test the functionality
public class RemoteControlTest {
 public static void main(String[] args) {
     // Create instances of each device
     Remote tvRemote = new TV();
     Remote fanRemote = new Fan();
     Remote acRemote = new AC();

     // Test TV remote
     tvRemote.turnOn();
     tvRemote.turnOff();

     // Test Fan remote
     fanRemote.turnOn();
     fanRemote.turnOff();

     // Test AC remote
     acRemote.turnOn();
     acRemote.turnOff();
 }
}



