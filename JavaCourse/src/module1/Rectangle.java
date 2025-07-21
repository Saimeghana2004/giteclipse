package module1;

public class Rectangle {
	
	    private int width;
	    private int height;

	    // Default constructor: width and height = 1
	    public Rectangle() {
	        this.width = 1;
	        this.height = 1;
	    }

	    // Constructor with parameters
	    public Rectangle(int width, int height) {
	        this.width = width;
	        this.height = height;
	    }

	    // Method to calculate area
	    public int area() {
	        return width * height;
	    }

	    // Main method to test the class
	    public static void main(String[] args) {
	        Rectangle rect1 = new Rectangle(); // Uses default constructor
	        Rectangle rect2 = new Rectangle(4, 5); // Uses parameterized constructor

	        System.out.println("Area of rect1: " + rect1.area());
	        System.out.println("Area of rect2: " + rect2.area());
	    }
	}



