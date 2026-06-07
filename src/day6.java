//PSL-1
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
//PSL-2
class Student{
    String name;
    int age;
    double grade;
    public Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void display(){
        System.out.println("name: "+  name + "\n age: " + age+ "\ngrade: " + grade);
    }
}

public class day6 {
    public static void main(String[] args) {
        //PSL-1
    BankAccount account1 = new BankAccount("Alice", 1000.0);
    BankAccount account2 = new BankAccount();

    account1.display();
    account2.display();

    //PSL-2
    Student s1 = new Student("Ali", 22, 1);
    Student s2 = new Student("Alina", 22, 1);
    Student s3 = new Student("sara", 22, 1);

}
}
