package com.andreamonacelli.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void deposit() {
        BankAccount bankaccount = new BankAccount();
        bankaccount.deposit(250);
        assertEquals(250.0, bankaccount.getBalance());
        bankaccount.deposit(100);
        assertEquals(350.0, bankaccount.getBalance());
        bankaccount.deposit(5.50);
        assertEquals(355.50, bankaccount.getBalance());
    }

    @Test
    void withdraw() {
        BankAccount bankaccount = new BankAccount(600.50);
        bankaccount.withdraw(100);
        assertEquals(500.50, bankaccount.getBalance());
        bankaccount.withdraw(250.50);
        assertEquals(250.0, bankaccount.getBalance());
        bankaccount.withdraw(50);
        assertEquals(200.0, bankaccount.getBalance());
    }
}