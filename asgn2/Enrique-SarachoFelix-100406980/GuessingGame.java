package asgn2;

import java.util.Scanner;
import java.lang.Math;

/**
 * Program name: GuessingGame
 * Simulates a game where the program generates a random number between 1 and
 * 10, and the user must guess the value.
 * 
 * @author Enrique Saracho Felix
 * @since June 2, 2023
 * 
 */
public class GuessingGame {
    /**
     * main: prompts user to enter value, generates random value, compares then and
     * displays result.
     */
    public static void main(String[] args) {
        int userNum, ranNum; // Declare variables.

        // Assing input value to userNum.
        Scanner input = new Scanner(System.in);
        System.out.print("What is your guess? ");
        userNum = input.nextInt();

        // Verifying input value.
        if (userNum < 1 || userNum > 10)
            System.out.println("Well, If you're not goint to \"try\", I'm not playing");
        else {
            ranNum = (int) (Math.random() * 10) + 1; // Assign random value to ranNum.

            // Calculating and displayin result.
            if (userNum == ranNum)
                System.out.println("Hurray. You win!");
            else {
                System.out.println("The number was " + ranNum);
                if (Math.abs(ranNum - userNum) <= 3)
                    System.out.println("It was close");
                else
                    System.out.println("You missed it by miles");
                System.out.println("Better luck next time");
            }
        }
        input.close();
    }
}
