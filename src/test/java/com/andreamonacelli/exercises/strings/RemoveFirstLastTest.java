package com.andreamonacelli.exercises.strings;

import com.andreamonacelli.exercises.arrays.MoveZeroEnd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstLastTest {

    @Test
    void removeFirstLast() {
        assertEquals("google", RemoveFirstLast.removeFirstLast("google"));
        assertEquals("enmn", RemoveFirstLast.removeFirstLast("aenmna"));
        assertEquals("", RemoveFirstLast.removeFirstLast("FF"));
        assertEquals("F", RemoveFirstLast.removeFirstLast("F"));
        assertEquals("nn", RemoveFirstLast.removeFirstLast("anna"));
    }
}