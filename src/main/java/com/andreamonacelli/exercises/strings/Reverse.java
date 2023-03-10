package com.andreamonacelli.exercises.strings;

//TESTS PASSED!
public class Reverse {
    public static String reverse(String string){
        StringBuilder strbuilder = new StringBuilder();
        for(int i = 0; i < string.length(); i++){
            strbuilder.append(string.charAt(string.length() - 1 - i));
        }
        return strbuilder.toString();
    }
}
