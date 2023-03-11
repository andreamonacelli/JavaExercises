package com.andreamonacelli.exercises.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodAroundTheBeginningTest {

    @Test
    void goodAroundTheBeginning() {
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning("good sweet"));
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning("good"));
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning(" good"));
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning(" good sweet"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning(" not good"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("nood"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("goo"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning(" goo"));
    }
}