package com.javaoop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class BankAccountTest {

    @Test
    void testDepositIncreasesBalance() {
        BankAccount account = new BankAccount("Ali", 1000.0);
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance());
    }

    @Test
    void testwithdraw() {
        BankAccount account = new BankAccount("Alina", 1200.0);
        account.withdraw(1000);
        assertEquals(200, account.getBalance());
    }

    @Test
    void NegativeDeposit() {
        BankAccount account = new BankAccount("Afifa", 11200.0);
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-2200);
        });
    }
    @Test
    void OverDraft(){
        BankAccount account = new BankAccount("Aila", 20000.0);
        assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-2200);
        });
    }
    @Test
    void Boundary(){
        BankAccount account = new BankAccount("Aila", 20000.0);
        account.withdraw(20000);
        assertEquals(0.0, account.getBalance());
    }

}
