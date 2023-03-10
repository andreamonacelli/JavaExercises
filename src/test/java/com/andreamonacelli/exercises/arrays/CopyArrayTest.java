package com.andreamonacelli.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyArrayTest {

    @Test
    void copyArray() {
        double[] src = new double[]{1, 4, 5, 6};
        double[] dst = CopyArray.copyArray(src);
        assertArrayEquals(src,dst);     //Condition that actually performs the test
    }
}