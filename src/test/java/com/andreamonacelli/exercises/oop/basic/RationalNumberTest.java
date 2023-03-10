package com.andreamonacelli.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RationalNumberTest {

    @Test
    void getNumerator() {
        RationalNumber number = new RationalNumber(3,2);
        assertEquals(3,number.getNumerator());
    }

    @Test
    void testEquals() {
        RationalNumber number1 = new RationalNumber(3,2);
        RationalNumber number2 = new RationalNumber(6,4);
        assertTrue(number2.equals(number1));
    }

    @Test
    void getDenominator() {
        RationalNumber number = new RationalNumber(3,2);
        assertEquals(2,number.getDenominator());
    }

    @Test
    void add() {
        RationalNumber n1 = new RationalNumber(3,2);
        RationalNumber n2 = new RationalNumber(3, 2);
        assertTrue(new RationalNumber(12,4).equals(n1.add(n2)));
    }

    @Test
    void multiply() {
        RationalNumber n1 = new RationalNumber(3,2);
        RationalNumber n2 = new RationalNumber(3, 2);
        assertTrue(n1.multiply(n2).equals(new RationalNumber(9, 4)));
    }

    @Test
    void testToString() {
        RationalNumber number = new RationalNumber(4,5);
        assertEquals("4/5",number.toString());
    }
}