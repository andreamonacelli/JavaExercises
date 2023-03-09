package com.andreamonacelli.exercises.warmup;

public class InterestRate {

    public static final int LIMIT = 3;      //Max years
    public static void main(String[] args) {
        double balance = 1000.00;     //Initial balance
        double interest_rate = 0.05;        //Earnings per year in interests
        System.out.println("Initial Balance: "+balance+"$");
        int years = 1;
        while (years <= LIMIT){
            balance = balance + (balance * interest_rate);      //Calculating the new balance after x years
            System.out.println("Balance after "+years+ " year(s): "+balance+"$");
            years++;        //Incrementing years
        }
    }
}
