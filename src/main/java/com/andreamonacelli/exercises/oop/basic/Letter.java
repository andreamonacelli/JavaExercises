package com.andreamonacelli.exercises.oop.basic;

//TESTS PASSED!
public class Letter {
    //Attributes set
    String from;
    String to;
    StringBuilder letter_body;

    //Constructor
    public Letter(String from, String to){
        this.from = from;
        this.to = to;
        this.letter_body = new StringBuilder();
        //setting the letter header
        this.letter_body.append("Dear ");
        this.letter_body.append(this.to);
        this.letter_body.append(":\n\n");
    }

    //Method to add line
    public void addLine(String line){
        this.letter_body.append(line);
        this.letter_body.append("\n");
    }

    //Method to get the whole text of the letter
    public String getText(){
        this.letter_body.append("\nSincerely,\n");
        this.letter_body.append(this.from);
        return this.letter_body.toString();
    }
}
