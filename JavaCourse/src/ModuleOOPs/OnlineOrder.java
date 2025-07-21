
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

// Abstract class Order - base for all types of orders
abstract class Order {
	protected String orderId;
	protected double amount;

	public Order(String orderId, double amount) {
		this.orderId = orderId;
		this.amount = amount;
	}

	// Abstract method to be implemented by subclasses
	public abstract void processOrder();

	// Common method for all orders
	public void displayOrderDetails() {
		System.out.println("Order ID: " + orderId);
		System.out.println("Amount: ₹" + amount);
	}
}

// Subclass for processing online orders
class OnlineOrder extends Order {
	private String deliveryAddress;

	public OnlineOrder(String orderId, double amount, String deliveryAddress) {
		super(orderId, amount);
		this.deliveryAddress = deliveryAddress;
	}

	@Override
	public void processOrder() {
		// Simulate processing of online order
		System.out.println("Processing online order...");
		displayOrderDetails();
		System.out.println("Delivery Address: " + deliveryAddress);
		System.out.println("Order will be shipped soon.\n");
	}
}

// Subclass for processing store pickup orders
class StoreOrder extends Order {
	private String storeLocation;

	public StoreOrder(String orderId, double amount, String storeLocation) {
		super(orderId, amount);
		this.storeLocation = storeLocation;
	}

	@Override
	public void processOrder() {
		// Simulate processing of store order
		System.out.println("Processing store pickup order...");
		displayOrderDetails();
		System.out.println("Pickup Location: " + storeLocation);
		System.out.println("Order will be ready for pickup soon.\n");
	}
}

// Main class to demonstrate order processing
class OrderProcessing {
	public static void main(String[] args) {
		// Creating and processing an online order
		Order onlineOrder = new OnlineOrder("ON001", 1499.99, "456 Tech Park Road, Bangalore");

		// Creating and processing a store order
		Order storeOrder = new StoreOrder("ST002", 799.50, "Hyderabad Mega Mall");

		// Process the orders
		onlineOrder.processOrder();
		storeOrder.processOrder();
	}
}
