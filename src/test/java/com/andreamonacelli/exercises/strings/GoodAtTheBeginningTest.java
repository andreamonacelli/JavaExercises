package com.andreamonacelli.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAtTheBeginningTest {

    @Test
    void goodAtTheBeginning() {
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("good morning yall"));
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("good"));
        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("good practice"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning(" good morning yall"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("ffffff"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("goo"));
    }
}