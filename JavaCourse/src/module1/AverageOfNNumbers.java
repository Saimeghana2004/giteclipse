package module1;

import java.util.Scanner;

public class AverageOfNNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum=0;
		int count=0;
		for(int i=1; i<=10; i++)
		{
		  sum+=i;
		  count++;
		//scanner.close();
		}System.out.printf("%.2f",(double)sum/count);
		
	}

}

