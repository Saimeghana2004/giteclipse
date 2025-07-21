package module1;

public class Bank {
	static int currentBalance=1000;
	
	public static void greetCustomer() {
		System.out.println("Hello,Welcome to the Bankig Application");
		
	}
	public static void deposit(int amount) {
		currentBalance=currentBalance+amount;
		System.out.println("amount deposited successfully");
		
	}
	public static void withdrawl(int amount) {
		currentBalance=currentBalance-amount;
		System.out.println("amount withdrawl successfully");
		
		
		
	}
	public int getCurrentBakance() {
		int currentBlance = 0;
		return currentBalance;
		
	}
    public static void main(String[]args) {
    	Bank bank=new Bank() ;
    	greetCustomer();
    	System.out.println("current balance is :" +bank.getCurrentBakance());
    	
        	  

          }
    }
