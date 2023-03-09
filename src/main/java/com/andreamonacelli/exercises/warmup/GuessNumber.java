package com.andreamonacelli.exercises.warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessNumber {
    public static void main(String[] args) {
        boolean guessed = false;        //Flag che mi indica quando terminare il gioco
        Scanner in = new Scanner(System.in);        //Oggetto Scanner per leggere in input da tastiera (System.in)
        RandomGenerator rng = RandomGenerator.getDefault();     //Oggetto per generare il numero casuale
        while(!guessed) {
            int to_guess = rng.nextInt(4);     //Genera il numero casuale tra 0 e 3
            System.out.println("Inserire il numero da indovinare");
            int in_number = in.nextInt();
            if (in_number == to_guess && to_guess == 0) {
                guessed = true;
                System.out.println("Complimenti!!!");
            }
            else{
                System.out.println("RIPROVA!");
            }
        }
    }
}
