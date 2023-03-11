package com.andreamonacelli.exercises.strings;

/**
 * The class provides a method to check whether a string includes the sequence
 * "good" at its beginning or after one character
 * (TESTS PASSED!)
 * @author Andrea Monacelli
 * @version 2023.03.11
 */
public class GoodAroundTheBeginning {

    /**
     * Checks if the string contains the sequence "good" either starting from
     * index 0 or 1
     * @param string is the string that we need to check
     * @return true if the condition is respected, false otherwise
     */
    public static boolean goodAroundTheBeginning(String string){
        if(string.length() < 4){
            return false;
        }
        return string.startsWith("good") || string.substring(1).startsWith("good");
    }
}
