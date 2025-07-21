package module1;

public class ConstructorDemo1 {
	String studentname;
	int birthyear;


	public ConstructorDemo1(String studentName, int birthyear) {
		 this.studentname = studentname;
		 this.birthyear = birthyear;
		 
	}

	public static void main(String[] args) {
		ConstructorDemo1 student1 = new ConstructorDemo1("Meghana", 2004);
		ConstructorDemo1 student2 = new ConstructorDemo1("Gyatri", 2003);
		ConstructorDemo1 student3 = new ConstructorDemo1("Gangothri", 2002);
	//	//((Object)// student1).displayInfo();/
	    student1.display();
		student2.display();
		student3.display();
}

	private void display() {
		// TODO Auto-generated method stub
		
	}

}
