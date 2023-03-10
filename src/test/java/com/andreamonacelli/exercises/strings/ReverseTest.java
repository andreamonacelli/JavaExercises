package com.andreamonacelli.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    void reverse() {
        String string = "John Doe";
        assertEquals("eoD nhoJ",Reverse.reverse(string));
    }
}