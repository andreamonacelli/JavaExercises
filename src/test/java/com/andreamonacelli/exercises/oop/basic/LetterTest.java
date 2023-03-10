package com.andreamonacelli.exercises.oop.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTest {

    @Test
    void addLine() {
        Letter letter = new Letter("Andrea", "Colleague");
        letter.addLine("line");
        assertEquals("Dear Colleague:\n\nline\n", letter.letter_body.toString());
    }

    @Test
    void getText() {
        Letter letter = new Letter("Andrea", "Colleague");
        assertEquals("Dear Colleague:\n\n\nSincerely,\nAndrea",letter.getText());
    }
}