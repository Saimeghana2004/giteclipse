
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

// Abstract base class Shape
abstract class Shape1 {
    // Abstract method to be implemented by subclasses
    public abstract void draw();
}

// Subclass Circle
class Circle1 extends Shape {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with length: " + length + " and width: " + width);
    }
}

// Subclass Triangle
class Triangle extends Shape {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle with base: " + base + " and height: " + height);
    }
}

// Main class to test shape drawing
public class ShapeDrawingProgram {
    public static void main(String[] args) {
        // Create objects of different shapes
        Shape circle = new Circle1(5.5);
        Shape rectangle = new Rectangle(10, 6);
        Shape triangle = new Triangle(8, 4);

        // Draw the shapes
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}

