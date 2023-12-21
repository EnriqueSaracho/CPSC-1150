import java.lang.Math;
import java.util.Scanner;

/**
 * Program name: RSPGame
 * This program allows the user to play rock, scissor, paper with the computer.
 * 
 * 
 * @author Enrique Saracho Felix
 * @since June 5, 2023
 * 
 */
public class RSPGame {
    /**
     * main: takes an integer from the user, randomly creates another one and
     * compares them with the rules of rock, scissor, paper.
     */
    public static void main(String[] args) {
        int userNum, compNum; // Declare variables.
        compNum = (int) (Math.random() * 3); // Assign random value to compNum.
        Scanner input = new Scanner(System.in);
        System.out.print("Select rock(0), scissor(1), or paper(2): ");
        userNum = input.nextInt(); // Assign user input to userNum.
        if (userNum < 0 || userNum > 2) {
            System.out.println("Error: Invalid input");
        } else if (userNum == compNum) {
            System.out.println("The computer is " + (compNum == 0 ? "rock" : compNum == 1 ? "scissor" : "paper")
                    + ". You are " + (compNum == 0 ? "rock" : compNum == 1 ? "scissor" : "paper")
                    + " too. It is a draw.");
        } else if (userNum == 0) {
            if (compNum == 1) {
                System.out.println("The computer is scissor. You are rock. You won!");
            } else {
                System.out.println("The computer is paper. You are rock. You lose.");
            }
        } else if (userNum == 1) {
            if (compNum == 2) {
                System.out.println("The computer is paper. You are scissor. You won!");
            } else {
                System.out.println("The computer is rock. You are scissor. You lose.");
            }
        } else {
            if (compNum == 0) {
                System.out.println("The computer is rock. You are paper. You won!");
            } else {
                System.out.println("The computer is scissor. You are paper. You lose");
            }
        }

        input.close();
    }

}
