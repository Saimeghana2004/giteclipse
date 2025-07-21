

/*
 * Objective:
 * Demonstrate different types of inheritance in Java: Single, Multilevel, Hierarchical, and Multiple (via Interface).
 *
 * Description:
 * This program showcases Java inheritance models by creating a set of classes that represent vehicles.
 * Different inheritance types are shown using appropriate class extensions and interface implementation.
 *
 * Contents of the Program:
 * - Class Vehicle: Base class for multiple inheritance types.
 * - Class Car: Inherits Vehicle (Single Inheritance).
 * - Class ElectricCar: Inherits Car (Multilevel Inheritance).
 * - Class Bike: Inherits Vehicle (Hierarchical Inheritance).
 * - Interface Engine: Used to demonstrate Multiple Inheritance.
 * - Class HybridCar: Inherits Vehicle and implements Engine (Multiple Inheritance via Interface).
 * - Class InheritanceTypesDemo: Contains the main method to execute and demonstrate inheritance.
 *
 * How Achieved using Concepts:
 * - Single Inheritance is achieved through Car → Vehicle.
 * - Multilevel Inheritance is shown through ElectricCar → Car → Vehicle.
 * - Hierarchical Inheritance is illustrated with both Car and Bike extending Vehicle.
 * - Multiple In*
 */

package module3;

public class AllTypesOFInheritance {// Interface for demonstrating multiple inheritance
	interface Engine {
	    void startEngine();
	}

	// Base class (superclass) - used for Single and Hierarchical Inheritance
	class Vehicle {
	    void type() {
	        System.out.println("This is a vehicle.");
	    }
	}

	// Single Inheritance: Car extends Vehicle
	class Car extends Vehicle {
	    void wheels() {
	        System.out.println("Car has 4 wheels.");
	    }
	}

	// Multilevel Inheritance: ElectricCar extends Car
	class ElectricCar extends Car {
	    void batteryType() {
	        System.out.println("ElectricCar uses lithium-ion battery.");
	    }
	}

	// Hierarchical Inheritance: Bike also extends Vehicle
	class Bike extends Vehicle {
	    void wheels() {
	        System.out.println("Bike has 2 wheels.");
	    }
	}

	// Class that demonstrates Multiple Inheritance via interface
	class HybridCar extends Vehicle implements Engine {
	    public void startEngine() {
	        System.out.println("HybridCar engine started.");
	    }

	    void fuelType() {
	        System.out.println("HybridCar uses petrol and electric.");
	    }
	}

	// Main class to run the program
	public class InheritanceTypesDemo {
	    public void main(String[] args) {

	        System.out.println("=== Single Inheritance ===");
	        Car car = new Car();
	        car.type();      // From Vehicle
	        car.wheels();    // From Car

	        System.out.println("\n=== Multilevel Inheritance ===");
	        ElectricCar eCar = new ElectricCar();
	        eCar.type();         // From Vehicle
	        eCar.wheels();       // From Car
	        eCar.batteryType();  // From ElectricCar

	        System.out.println("\n=== Hierarchical Inheritance ===");
	        Bike bike = new Bike();
	        bike.type();     // From Vehicle
	        bike.wheels();   // From Bike

	        System.out.println("\n=== Multiple Inheritance using Interface ===");
	        HybridCar hCar = new HybridCar();
	        hCar.type();        // From Vehicle
	        hCar.startEngine(); // From Engine interface
	        hCar.fuelType();    // From HybridCar
	    }
	}


}
