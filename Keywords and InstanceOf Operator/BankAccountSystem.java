import java.util.Scanner;
public class BankAccountSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Input for first account
        System.out.print("Enter account holder's name : ");
        String name1 = sc.nextLine();
        System.out.print("Enter account number : ");
        String accNo1 = sc.nextLine();

        BankAccount acc1 = new BankAccount(name1, accNo1);

        // Input for second account
        System.out.print("\nEnter another account holder's name : ");
        String name2 = sc.nextLine();
        System.out.print("Enter another account number : ");
        String accNo2 = sc.nextLine();

        BankAccount acc2 = new BankAccount(name2, accNo2);

        // Using instanceof operator
        System.out.println("\n--- Account Details ---");
        if (acc1 instanceof BankAccount) {
            acc1.displayAccountDetails();
        }

        System.out.println();

        if (acc2 instanceof BankAccount) {
            acc2.displayAccountDetails();
        }

        // Static method call
        System.out.println();
        BankAccount.getTotalAccounts();
	}
}
