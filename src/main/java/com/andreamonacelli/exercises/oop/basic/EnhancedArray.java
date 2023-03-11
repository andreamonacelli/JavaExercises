package com.andreamonacelli.exercises.oop.basic;

import java.util.Arrays;
import java.util.random.RandomGenerator;

/**
 * The class implements an enhanced version of an array, alongside some key functionalities
 * that will be provided by the class itself
 * (TESTS PASSED!)
 * @author Andrea Monacelli
 * @version 2023.03.11
 */
public class EnhancedArray {
    /** The "common" array that we are going to enhance */
    private int[] v;

    /**
     * Constructor that initializes an enhanced array of a specified capacity
     * @param capacity is the specified capacity of the array
     */
    public EnhancedArray(int capacity){
        this.v = new int[capacity];
    }

    /**
     * Returns the size of the enhanced array
     * @return the length of the array
     */
    public int size(){
        return this.v.length;
    }

    /**
     * Get the value at the specified index
     * @param index is the index of which we want to know the value
     * @return the correspondent value
     */
    public int get(int index){
        return this.v[index];
    }

    /**
     * Insert a specified value into a specified index in the array
     * @param index is the position in which we want to insert the value
     * @param value is the value to set
     */
    public void set(int index, int value){
        if(index < this.v.length && index >= 0){
            this.v[index] = value;
        }
        else{
            System.out.println("Cannot set value! Invalid index");
        }
    }

    /**
     * Checks whether a value is contained in the array or not
     * @param value is the value to check
     * @return true if the value is present, false otherwise
     */
    public boolean contains(int value){
        for(int i = 0; i < this.v.length; i++){
            if(v[i] == value){
                return true;
            }
        }
        return false;
    }

    /**
     * Sets all the elements in the array to zero
     */
    public void resetZero(){
        Arrays.fill(this.v, 0);
    }

    /**
     * Sets all the elements in the array to a random number
     * between 0 and the value corresponding to the size of the array
     */
    public void resetRandom(){
        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        for(int i = 0; i < this.v.length; i++){
            this.set(i, randomGenerator.nextInt(0, this.size() + 1));
        }
    }

    /**
     * Returns a copy of the internal enhanced array
     * @return an int[] corresponding
     */
    public int[] toArray(){
        return Arrays.copyOf(this.v, this.v.length);
    }
}
