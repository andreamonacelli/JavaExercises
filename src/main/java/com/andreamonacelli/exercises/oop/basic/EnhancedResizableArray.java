package com.andreamonacelli.exercises.oop.basic;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * The class represents an enhanced version of "common" arrays, alongside their usual functionalities
 * An added feature to the EnhancedArray class is that these arrays are resizable
 * @author Andrea Monacelli
 * @version 2023.03.11
 * @testsResults NotDoneYet
 */
public class EnhancedResizableArray {
    /** default length of the array */
    private static final int DEFAULT_LENGTH = 4;
    /** attribute containing the actual array */
    private int[] v;
    /** attribute containing actual current size */
    private int size;

    /**
     * Initializes a resizable array with a default length
     */
    public EnhancedResizableArray(){
        this.v = new int[DEFAULT_LENGTH];
        this.size = 0;
    }

    /**
     * Adds a specified value into the array resizing it
     * @param value is the value to insert
     */
    public void add(int value){
        if(this.size < DEFAULT_LENGTH){
            this.v[size] = value;
            size++;
        } else {
            size++;
            this.v = Arrays.copyOf(this.v, this.size);
            this.v[size - 1] = value;
        }
    }

    /**
     * Removes the element placed on the specified index inside the array
     * @param index the index of the element that you want to remove
     */
    public void remove(int index){      //TO FIX: THE SWAP OF ELEMENTS IS WRONG AND IT SHOULDN'T BE DONE
        if(index != this.v.length - 1){
            this.v[index] = this.v[this.v.length - 1];
        }
        size--;
        this.v = Arrays.copyOf(this.v, this.v.length - 1);
    }

    /**
     * Returns the element in the position specified by index
     * @param index specifies the position of the element you want to get
     * @return the element in position index
     */
    public int get(int index){
        return this.v[index];
    }

    /**
     * Set the value in position index with the specified value
     * @param index position of the element to set
     * @param value the value to insert into the array
     */
    public void set(int index, int value){
        this.v[index] = value;
    }

    /**
     * Checks if the specified value is contained in the array
     * @param value is the value to check
     * @return true if the value is present, false otherwise
     */
    public boolean contains(int value){
        for(int i = 0; i < this.v.length; i++){
            if(this.v[i] == value){
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the capacity of the array
     * @return an integer corresponding to the size of the array
     */
    public int size(){
        return this.size;
    }

    /**
     * Returns a copy of the internal array
     * @return an int[] which is the copy of the internal array
     */
    public int[] toArray(){
        return Arrays.copyOf(this.v, this.v.length);
    }
}
