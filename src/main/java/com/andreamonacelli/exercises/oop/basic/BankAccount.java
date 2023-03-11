package com.andreamonacelli.exercises.oop.basic;

/**
 * A bank account with its own balance, you can deposit or withdraw an amount of money, as well as getting info
 * about the current balance
 * (TESTS PASSED!)
 * @author Andrea Monacelli
 * @version 2023.03.11
 */
public class BankAccount {
    /** Balance of the account */
    private double balance;

    /**
     * Initialize an empty account
     */
    public BankAccount() {
        this.balance = 0.0;
    }

    /**
     * Initialize a new account with an initial balance
     * @param balance is the initial balance that will be stored into the account
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Deposit a certain amount of money in your account to increase the balance
     * @param amount the amount of money to deposit
     */
    public void deposit(double amount){
        this.balance += amount;
    }

    /**
     * Withdraw a certain amount of money from your account (this will decrease the balance)
     * Note that the balance cannot be less than zero
     * @param amount the amount of money to withdraw
     */
    public void withdraw(double amount){
        this.balance = Math.max(this.balance - amount, 0.0);
    }
}
