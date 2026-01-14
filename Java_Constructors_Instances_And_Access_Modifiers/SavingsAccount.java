class SavingsAccount extends BankAccount {
	//Constructor
	public SavingsAccount(String accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
	}
	
	// Method to show that accountNumber and accountHolder are accessible
    public void displayDetails() {
        System.out.println("\n---- Accessing from SavingsAccount ----");
        System.out.println("Account Number : " + accountNumber);      
        System.out.println("Account Holder : " + accountHolder);      
    }
}
