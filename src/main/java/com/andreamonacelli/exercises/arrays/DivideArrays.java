package com.andreamonacelli.exercises.arrays;

//TESTS PASSED!
public class DivideArrays {
    /**
     * The following method will divide values in v1 by the values placed at the same index in v2
     * @param v1 contains the numbers that will be divided
     * @param v2 contains the divisors
     * @return a vector with all the right calculations done if the size of the two vectors is the same, returns null otherwise
     */
    public static double[] divideArrays(double[] v1, double[] v2){
        if(v1.length != v2.length){
            return null;
        }
        double[] dst = new double[v1.length];
        for(int i = 0; i < v1.length; i++){
            dst[i] = v1[i]/v2[i];
        }
        return dst;
    }
}
