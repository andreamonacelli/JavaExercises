package com.andreamonacelli.exercises.strings;

/**
 * The following class provides a method that will remove the first and the last
 * character of a string only if they are the same character
 * @author Andrea Monacelli
 * @version 2023.03.11
 * @testsResults Passed!
 */
public class RemoveFirstLast {

    /**
     * Removes the first AND the last character of a string but
     * only if they are the same character
     * @param string is the string in which the characters will be eventually removed
     * @return the formatted string
     */
    public static String removeFirstLast(String string){
        if(string.charAt(0) == string.charAt(string.length() - 1) && string.length() > 1){
            if(string.length() == 2){
                return "";
            }
            return string.substring(1, string.length() - 1);
        }
        return string;
    }
}
