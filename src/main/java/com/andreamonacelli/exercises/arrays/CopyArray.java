package com.andreamonacelli.exercises.arrays;

public class CopyArray {
    public static double[] copyArray(double[] v){
        double[] dst = new double[v.length];        //Create the second array
        //Copy the array that has been passed as parameter
        //There are many ways to perform the requested task, you will see a very simple one below
        for(int i = 0; i < v.length; i++){
            dst[i] = v[i];
        }
        return dst;
    }
}
