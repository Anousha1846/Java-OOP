package com.javaoop;

public class BankAccount {

    private String owner;
    private double balance;

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
    if (amount <= 0) {
        throw new IllegalArgumentException("Invalid deposit amount: " + amount);
    }
    balance += amount;
}

public void withdraw(double amount) {
    if (amount <= 0 || amount > balance) {
        throw new IllegalArgumentException("Invalid withdrawal amount: " + amount);
    }
    balance -= amount;
}
}
