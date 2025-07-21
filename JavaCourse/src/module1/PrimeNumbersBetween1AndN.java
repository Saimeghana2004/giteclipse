
package module1;
		import java.util.Scanner;

		public class PrimeNumbersBetween1AndN {

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Ask the user for the value of N
		        System.out.print("Enter the value of N: ");
		        int n = scanner.nextInt();

		        System.out.println("Prime numbers between 1 and " + n + ":");

		        for (int i = 1; i <= n; i++) {
		            if (isprime(i)) {
		                System.out.print(i + " ");
		            }
		        }

		        scanner.close();
		    }

		    public static boolean isprime(int num) {
		    	if(num<=1)
		    		return false;
		    	for(int i = 2;i<=Math.sqrt(num);i++) 
		    		if(num%i==0)
		    			return false;
				return true;
		    			
		    }
		


	}


