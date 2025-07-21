package module1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
			}
        System.out.println(f);
       

	}

}
