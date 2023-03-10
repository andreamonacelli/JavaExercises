package com.andreamonacelli.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FillArraysTest {

    @Test
    void fillArray() {
        int size = 3;
        int value = 0;
        boolean randomize = false;
        assertArrayEquals(new double[]{0, 0, 0}, FillArrays.fillArray(size, value, randomize));
    }
}