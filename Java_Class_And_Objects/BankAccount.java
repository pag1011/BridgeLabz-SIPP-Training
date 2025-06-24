
import java.util.Scanner;

class BankAccounts {
	String accountHolder;
	String accountNumber;
	double balance;
	
	//Constructor
	BankAccounts(String accountHolder, String accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	//Method to deposit 
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited : Rs." + amount);
	}
	
	//Method to withdraw
	void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw : Rs." + amount);
		} else {
			System.out.println("Insufficient Balance!");
		}
	}
	
	//Method to display balance
	void displayBalance() {
		System.out.println("Account Holder : " + accountHolder);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Current Balance : Rs." + balance);
	}
}

public class BankAccount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String accountHolder, accountNumber;
		double balance, depositAmt, withdrawAmt;
		
		//Take input user
		System.out.println("Enter the account holder name : ");
		accountHolder = sc.nextLine();
		System.out.println("Enter the account number : ");
		accountNumber = sc.nextLine();
		System.out.println("Enter the balance : ");
		balance = sc.nextDouble();
		
		//Create acc object for Bank Account
		BankAccounts acc = new BankAccounts(accountHolder, accountNumber, balance);
		
		System.out.println("Enter amount to be deposit : ");
		depositAmt = sc.nextDouble();
		System.out.println("Enter amount to withdraw : ");
		withdrawAmt = sc.nextDouble();
		
		//Display all the details of bank account
		acc.displayBalance();
		acc.deposit(depositAmt);
		acc.withdraw(withdrawAmt);
		acc.displayBalance();
	}

}
