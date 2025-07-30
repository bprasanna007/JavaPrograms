package io.prasana;

import java.util.Scanner;
import java.util.Random;

public class Randomnumber {

    public static void main(String[] args) {


        Scanner get = new Scanner(System.in);
        System.out.println("guess the number from 1 to 100");
        Random random = new Random();
        int number, guess;
        number = random.nextInt(100) + 1;
        int attempts = 0;
        int maxattempts = 5;


        do {


            System.out.print("Enter your guess: ");
            guess = get.nextInt();
            attempts++;


            if (number == guess) {
                System.out.println("Guessed correctly in " + attempts + " attempts!");
            } else if (number > guess) {
                System.out.println("too low");


            } else {
                System.out.println("too high");
            }

        } while (number != guess && attempts < maxattempts);

        if (guess != number) {
            System.out.println("You ran out of attempts. The correct number was: " + number);
        }


    }
}


