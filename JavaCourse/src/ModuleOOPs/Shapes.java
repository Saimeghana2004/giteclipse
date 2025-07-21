

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

public class Shapes {
    private String shapeType;
    private double radius;
    private double length;
    private double breadth;

    private Shapes(String shapeType) {
        this.shapeType = shapeType;
    }

    // Factory method for Circle
    public static Shapes createCircle(double radius) {
        Shapes shape = new Shapes("Circle");
        shape.radius = radius;
        return shape;
    }

    // Factory method for Rectangle
    public static Shapes createRectangle(double length, double breadth) {
        Shapes shape = new Shapes("Rectangle");
        shape.length = length;
        shape.breadth = breadth;
        return shape;
    }

    // Method to calculate area
    public double area() {
        if (shapeType.equals("Circle")) {
            return Math.PI * radius * radius;
        } else if (shapeType.equals("Rectangle")) {
            return length * breadth;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Shapes circle = Shapes.createCircle(7);           // Circle with radius 7
        Shapes rectangle = Shapes.createRectangle(10, 5); // Rectangle with length 10 and breadth 5

        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
