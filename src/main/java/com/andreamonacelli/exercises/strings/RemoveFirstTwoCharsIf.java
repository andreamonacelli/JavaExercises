package com.andreamonacelli.exercises.strings;

//TESTS PASSED!
public class RemoveFirstTwoCharsIf {
    public static String removeFirstTwoCharsIf(String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (i == 0 && string.charAt(i) == 'H') {
                builder.append(string.charAt(i));
            }
            if (i == 1 && string.charAt(i) == 'e') {
                builder.append(string.charAt(i));
            }
            if(i > 1){
                builder.append(string.charAt(i));
            }
        }
        return builder.toString();
    }
}
