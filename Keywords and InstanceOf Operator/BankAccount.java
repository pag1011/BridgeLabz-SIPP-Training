class BankAccount {
    // Static variable
    static String bankName = "Secure Bank";
    static int totalAccounts = 0;

    // Final variable
    private final String accountNumber;
    private String accountHolderName;

    // Constructor using 'this'
    BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts : " + totalAccounts);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank Name : " + bankName);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
    }
}