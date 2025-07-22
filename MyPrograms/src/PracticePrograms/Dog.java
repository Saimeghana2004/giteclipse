package PracticePrograms;
 class Animal{
	 String color="white";
 }


public class Dog extends Animal {
	String color="black";
	
	void printcolor() {
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Dog obj = new Dog();
      obj.printcolor();
        
	}

}
