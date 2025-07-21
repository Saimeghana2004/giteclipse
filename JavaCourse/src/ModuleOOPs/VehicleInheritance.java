
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

// Base class Vehicle
class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to describe the vehicle - can be overridden
    public void displayInfo() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Derived class Car
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Details:");
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println();
    }
}

// Derived class Bike
class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike Details:");
        super.displayInfo();
        System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
        System.out.println();
    }
}

// Derived class Truck
class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String brand, int speed, int loadCapacity) {
        super(brand, speed);
        this.loadCapacity = loadCapacity; // in tons
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Details:");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
        System.out.println();
    }
}

// Main class to test the hierarchy
public class VehicleInheritance {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 180, 4);
        Vehicle bike = new Bike("Honda", 100, true);
        Vehicle truck = new Truck("Volvo", 120, 15);

        car.displayInfo();
        bike.displayInfo();
        truck.displayInfo();
    }
}

