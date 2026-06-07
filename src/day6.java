class BankAccount {
    String owner;
    double balance;

     public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }
    public BankAccount(){
       this("Unknown", 0.0);
    }

    public void display(){
        System.out.println("Balance: "+  balance + "\n Owner: " + owner);
    }

}
public class day6 {
    public static void main(String[] args) {
    BankAccount account1 = new BankAccount("Alice", 1000.0);
    BankAccount account2 = new BankAccount();

    account1.display();
    account2.display();
}
}
