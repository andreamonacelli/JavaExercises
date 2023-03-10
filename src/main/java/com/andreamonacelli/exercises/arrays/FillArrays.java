package com.andreamonacelli.exercises.arrays;

import java.util.random.RandomGenerator;

//TESTS PASSED!
public class FillArrays {
    public static double[] fillArray(int size, int value, boolean randomize){
        double[] dst = new double[size];        //Create the new array in
        double correctingFactor;       //Factor to add if randomize flag is set on true
        RandomGenerator randomgen = RandomGenerator.getDefault();       //Instantiate the randomizer
        for(int i = 0; i < size; i++){
            if(!randomize){
                correctingFactor = 0;
            } else{
                correctingFactor = randomgen.nextDouble(-0.5, 0.5);
            }
            dst[i] = value + correctingFactor;
        }
        return dst;
    }
}
