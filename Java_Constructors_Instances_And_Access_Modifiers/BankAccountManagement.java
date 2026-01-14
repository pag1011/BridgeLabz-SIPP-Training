import java.util.Scanner;

public class BankAccountManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String accountNumber, accountHolder;
		double balance;
		
		System.out.println("Enter the account number : ");
		accountNumber = sc.nextLine();
		System.out.println("Enter the account holder name : ");
		accountHolder = sc.nextLine();
		System.out.println("Enter the balance : ");
		balance = sc.nextDouble();
		sc.nextLine();
		
		SavingsAccount saveAcc = new SavingsAccount(accountNumber, accountHolder, balance);
		saveAcc.display();
		
		System.out.println("Enter the updated balance : ");
		saveAcc.setBalance(sc.nextDouble());
		System.out.println("Updated Balance : " + saveAcc.getBalance());
	}
}
