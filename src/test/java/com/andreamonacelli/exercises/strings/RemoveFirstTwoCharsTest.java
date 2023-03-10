package com.andreamonacelli.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharsTest {

    @Test
    void removeFirstTwoChars() {
        String string = "no";
        assertEquals("",RemoveFirstTwoChars.removeFirstTwoChars(string));
    }
}