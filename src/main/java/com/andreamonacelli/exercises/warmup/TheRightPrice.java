package com.andreamonacelli.exercises.warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class TheRightPrice {
    public static void main(String[] args) {
        RandomGenerator rng = RandomGenerator.getDefault();     //Object used to generate the random price
        int price = rng.nextInt(101);     //Price variable whose value has been randomly generated
        Scanner scanner = new Scanner(System.in);       //Scanner object which will be used to read data from the keyboard
        System.out.println("Player 1, what do you think the price is?");
        int p1guess = scanner.nextInt();
        System.out.println("Moving on to player 2, what do you think the price is?");
        int p2guess = scanner.nextInt();
        int p1distance = Math.abs(p1guess - price);     //Calculating absolute value of the difference to see which player got closer to the right value
        int p2distance = Math.abs(p2guess - price);     //Calculating absolute value of the difference to see which player got closer to the right value
        if(p1distance < p2distance){
            System.out.println("And today's winner is... PLAYER 1!");
        } else if (p1distance == p2distance) {
            System.out.println("And we got an incredible DRAW!!!");
        }else{
            System.out.println("And today's winner is... PLAYER2!");
        }
        System.out.println("Today's price was "+price);
    }
}
