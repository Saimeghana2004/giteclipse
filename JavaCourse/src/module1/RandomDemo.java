package module1;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y = 100, x = 5;
		while (y > 0) {
		    y--;
		    if (y % x != 0) {
		        continue;
		    }
		    System.out.println(y);
		}


	}

}
