
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

// Define the Payment interface with a common method
interface Payment {
    void makePayment(double amount); // Method to process payment
}

// Implementation of Payment using Credit Card
class CreditCard implements Payment {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment(double amount) {
        // Simulate payment processing
        System.out.println("Processing credit card payment of ₹" + amount + " using card: " + cardNumber);
    }
}

// Implementation of Payment using PayPal
class PayPal implements Payment {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void makePayment(double amount) {
        // Simulate payment processing
        System.out.println("Processing PayPal payment of ₹" + amount + " from account: " + email);
    }
}

// Implementation of Payment using UPI
class UPI implements Payment {
    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void makePayment(double amount) {
        // Simulate payment processing
        System.out.println("Processing UPI payment of ₹" + amount + " through UPI ID: " + upiId);
    }
}

// Main class to demonstrate payment processing
public class PaymentInterface {
    public static void main(String[] args) {
        // Create instances of different payment methods
        Payment creditCardPayment = new CreditCard("1234-5678-9876-5432");
        Payment paypalPayment = new PayPal("user@example.com");
        Payment upiPayment = new UPI("user@upi");

        // Perform payments
        creditCardPayment.makePayment(2000.00);
        paypalPayment.makePayment(1500.50);
        upiPayment.makePayment(999.99);
    }
}
