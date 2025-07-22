package PracticePrograms;

class Vehicle{
	void drive() {
		System.out.println("driving");	
	}
}

public class Car extends Vehicle{
	void drive() {
		System.out.println("I am driving");
	}
	public static void main(String[] args) {
		//Car obj=new Car();
		//obj.drive();
	Vehicle obj=new Car();   //UPCASTING
	obj.drive();
	}
}
