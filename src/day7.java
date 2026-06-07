
class BankAccount {

    private String owner;
    public double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public BankAccount() {
        this("Unknown", 0.0);
    }

    //getters
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

}

public class day7 {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", 1000.0);
        BankAccount account2 = new BankAccount();
        account1.deposit(500.0);
        account1.withdraw(200.0);
        System.out.println(account1.getOwner() + " balance: " + account1.getBalance());
        account1.deposit(-100);     // invalid deposit
        account1.withdraw(99999);   // overdraft
        account1.balance = -22222789;  // direct access to balance (not recommended)
        System.out.println(account1.getOwner() + " balance: " + account1.getBalance());
    }
}
