package PracticePrograms;

 class Adder1 {
	 static int add(int a, int b) {
		 return a+b;
	}
	static double add(double a, double b) {
		return a+b;
	}
	
}

public class Addition {  //overloading by changing datatype
	public static void main(String[] args) {
		System.out.println(Adder1.add(10, 20));
		System.out.println(Adder1.add(23.5, 34.9));
	}

}
