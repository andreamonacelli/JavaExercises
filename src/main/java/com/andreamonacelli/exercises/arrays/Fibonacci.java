package com.andreamonacelli.exercises.arrays;

//TESTS PASSED!
public class Fibonacci {
    public static long[] fibonacci(int n){
        if(n == 0){
            return null;
        }
        long[] fibonacci = new long[n];
        fibonacci[0] = 0;
        if(n == 1){
            return fibonacci;
        }
        fibonacci[1] = 1;
        if(n == 2){
            return fibonacci;
        }
        for(int i = 2; i < n; i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }
}
