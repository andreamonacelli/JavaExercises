package com.andreamonacelli.exercises.arrays;

import java.util.Arrays;

/**
 * The class provides a method that sends all the zero values
 * that are present in an int[] array to the end of the array
 * (TESTS PASSED!)
 * @author Andrea Monacelli
 * @version 2023.03.11
 */
public class MoveZeroEnd {

    /**
     * Send the zeros at the end of the value
     * @param v the input array
     * @return a new array organized as written above
     */
    public static int[] moveZerosEnd(int[] v){
        int[] reorganizedArray = new int[v.length];
        int reorganizedIndex = 0;
        for(int i = 0; i < v.length; i++){
            if(v[i] != 0){
                reorganizedArray[reorganizedIndex] = v[i];
                reorganizedIndex++;
            }
        }
        Arrays.fill(reorganizedArray,reorganizedIndex,v.length - 1, 0);
        return reorganizedArray;
    }
}
