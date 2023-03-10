package com.andreamonacelli.exercises.strings;

//TESTS PASSED!
public class RemoveFirstTwoChars {
    public static String removeFirstTwoChars(String string){
        StringBuilder stringbuilder = new StringBuilder();
        if(string.length() > 2) {
            for (int i = 2; i < string.length(); i++) {
                stringbuilder.append(string.charAt(i));
            }
        }
        return stringbuilder.toString();
    }
}
