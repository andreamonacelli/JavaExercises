package com.andreamonacelli.exercises.oop.basic;

import java.util.Objects;

public class RationalNumber {
    //Attributes set
    int numerator;
    int denominator;

    //Constructor

    public RationalNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //Getters
    public int getNumerator() {
        return numerator;
    }

    //Autogenerated methods equals() and hashcode() --> i have then changed the equals method to make it logically right
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RationalNumber that)) return false;
        return this.getNumerator()/this.getDenominator() == that.getNumerator()/that.getDenominator();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumerator(), getDenominator());
    }

    public int getDenominator() {
        return denominator;
    }

    //Method to add two different rational numbers (this method doesn't implement simplifying, might get back to develop it later)
    public RationalNumber add(RationalNumber o){
        int new_denominator = this.denominator * o.denominator;
        int new_numerator = (this.numerator * o.denominator) + (o.numerator * this.denominator);
        return new RationalNumber(new_numerator, new_denominator);
    }

    //Method to multiply two rational numbers
    public RationalNumber multiply(RationalNumber o){
        int new_denominator = this.denominator * o.denominator;
        int new_numerator = this.numerator * o.numerator;
        return new RationalNumber(new_numerator,new_denominator);
    }

    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}
