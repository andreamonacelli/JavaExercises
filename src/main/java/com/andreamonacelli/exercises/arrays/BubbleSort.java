package com.andreamonacelli.exercises.arrays;

import java.util.Arrays;

/**
 * The following class provides a method that can perform the bubble sort algorithm on
 * an array of integers
 * (TESTS PASSED!)
 * @author Andrea Monacelli
 * @version 2023.03.11
 */
public class BubbleSort {
    /**
     * Sort an array of integers using the bubble sort algorithm
     * @param v is the array to be sorted
     */
    public static void bubbleSort(int[] v){
        for(int i = 0; i < v.length - 1; i++){
            for(int j = 0; j < v.length - i - 1; j++){
                if(v[j] > v[j + 1]){
                    int tmp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = tmp;
                }
            }
        }
    }

    /**
     * Sort an array of integers using the bubble sort algorithm
     * The sorting won't be made in the original array, a sorted copy of it will be returned
     * @param v is the array to be sorted
     * @return a copy of the array passed as parameter but sorted using bubble sort algorithm
     */
    public static int[] bubbleSortCopy(int[] v){
        int[] sorted = Arrays.copyOf(v, v.length);
        bubbleSort(sorted);
        return sorted;
    }
}
