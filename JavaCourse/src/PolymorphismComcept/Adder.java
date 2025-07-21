package PolymorphismComcept;

public class Adder { //overloading by changing number of parameters
	
	static  int add(int a,int b) {
		return a+b;

	}
    static  int add(int a,int b, int c) {
    	return a+b+c;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(10, 12));
		System.out.println(Adder.add(10, 12,24));

	}

}
