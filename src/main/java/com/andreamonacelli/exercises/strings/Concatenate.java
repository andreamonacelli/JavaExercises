package com.andreamonacelli.exercises.strings;

//TESTS PASSED!
public class Concatenate {
    public static String concatenate(String[] strings){
        //Create a StringBuilder object with whom we are going to build the concatenated string
        StringBuilder stringbuilder = new StringBuilder();
        //Loop to concatenate the strings given as input parameter
        for (String string : strings) {
            stringbuilder.append(string);
        }
        //Return the final string
        return stringbuilder.toString();
    }
}
