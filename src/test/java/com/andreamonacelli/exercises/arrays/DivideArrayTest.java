package com.andreamonacelli.exercises.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArrayTest {

    @Test
    void divideArray() {
        double[] src = new double[]{2.0, 3.8, 4.3};
        double factor = 1.0;
        assertArrayEquals(new double[]{2.0, 3.8, 4.3},DivideArray.divideArray(src, factor));
    }
}