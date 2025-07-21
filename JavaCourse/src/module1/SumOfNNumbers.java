package module1;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: n
        System.out.print("Enter a positive integer (n): ");
        int n = sc.nextInt();

        // 1. Using Formula
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum using formula: " + sumFormula);

        // 2. Using Loop
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }
        System.out.println("Sum using loop: " + sumLoop);

        // 3. Using Recursion (Optional)
        int sumRecursion = recursiveSum(n);
        System.out.println("Sum using recursion: " + sumRecursion);

        sc.close();
    }

	private static int recursiveSum(int n) {
		// TODO Auto-generated method stub
		return 0;
	}
}



