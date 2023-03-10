package com.andreamonacelli.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateTest {

    @Test
    void concatenate() {
        String[] strings = new String[]{"Hel", "lo", " ", "World!"};
        assertEquals("Hello World!", Concatenate.concatenate(strings));
    }
}