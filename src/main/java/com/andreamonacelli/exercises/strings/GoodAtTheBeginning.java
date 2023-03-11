package com.andreamonacelli.exercises.strings;

//TESTS PASSED!
public class GoodAtTheBeginning {
    /**
     * Checks if the string passed as parameter contains the sequence "good" at the beginning
     * @param string is the string in which we have to check the presence of the sequence "good" at its beginning
     * @return true if the string starts with "good", false otherwise
     */
    public static boolean goodAtTheBeginning(String string){
        if(string.length() < 4){
            return false;
        }
        String good = "good";
        for(int i = 0; i < 4; i++){
            if(string.charAt(i) != good.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
