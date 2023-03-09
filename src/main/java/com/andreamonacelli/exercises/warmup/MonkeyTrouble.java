package com.andreamonacelli.exercises.warmup;

import java.util.Scanner;

public class MonkeyTrouble {
    public static void main(String[] args) {
        boolean aSmile;
        boolean bSmile;
        Scanner scanner = new Scanner(System.in);       //Oggetto scanner per leggere da tastiera
        System.out.println("Is the monkey A smiling? (write true/false)");
        aSmile = scanner.nextBoolean();     //Prendo in input il boolean
        System.out.println("Is the monkey B smiling? (write true/false)");
        bSmile = scanner.nextBoolean();     //Prendo in input il boolean
        if((aSmile && bSmile)||(!aSmile && !bSmile)){
            System.out.println("OH NO! WE'RE IN TROUBLE!");
        }
        else{
            System.out.println("Nothing to worry, we're safe!");
        }
    }
}
