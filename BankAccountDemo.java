// BankAccount class to represent a bank account with access control
class BankAccount {
    // Public attribute (accessible from anywhere)
    public String accountHolder;

    // Private attribute (only accessible within this class)
    private double balance;

    // Protected attribute (accessible within the same package and subclasses)
    protected String accountType;

    // Constructor to initialize account details
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Method to get the current balance (since balance is private)
    public double getBalance() {
        return balance;
    }
}

// Main class containing the main method
public class BankAccountDemo {
    public static void main(String[] args) {
        // Creating a BankAccount object with initial values
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");

        // Performing transactions
        myAccount.deposit(250.0);
        myAccount.withdraw(100.0);

        // Displaying account details
        System.out.println("\nAccount Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
