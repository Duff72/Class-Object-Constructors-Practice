public class BankAccount {
    // Attributes
    private double balance;
    private String accountHolder;

    // Constructor
    public BankAccount(double initialBalance, String accountHolder) {
        this.balance = initialBalance;
        this.accountHolder = accountHolder;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdrawal(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew $" + amount);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to print account details
    public void printAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Create the first BankAccount object with an initial balance of $5000
        BankAccount account1 = new BankAccount(5000, "Alice Johnson");

        // Create the second BankAccount object with an initial balance of $300
        BankAccount account2 = new BankAccount(300, "Bob Smith");

        // Withdraw $100 from the first account
        account1.withdrawal(100);

        // Deposit $100 into the second account
        account2.deposit(100);

        // Print the account details for both accounts
        System.out.println("\nAccount 1 Details:");
        account1.printAccountDetails();

        System.out.println("\nAccount 2 Details:");
        account2.printAccountDetails();
    }
}
