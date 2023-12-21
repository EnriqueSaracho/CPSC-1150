import java.util.Scanner;

/**
 * Program name: RSPGame
 * Allows the user to play rock, scissors, paper game against the computer to
 * the best of 5.
 * 
 * @author Enrique Saracho Felix
 * @since July 1, 2023
 * 
 */
public class RSPGame {
    /**
     * main: calls the method that runs the game.
     */
    public static void main(String[] args) {
        playRSP();
    }

    /**
     * playRSP: runs the game rounds, keeps track of the wins for each side.
     */
    public static void playRSP() {
        int userWins = 0, compWins = 0, round = 1;
        int result;
        while (round <= 5 && userWins < 3 && compWins < 3) {
            result = playRound();
            switch (result) {
                case 1:
                    userWins++;
                    break;
                case 2:
                    compWins++;
                    break;
                default:
                    break;
            }
            round++;
        }
        displayResult(userWins, compWins);
    }

    /**
     * playRound: generates the result of a round.
     * 
     * @return '0' if it's a draw, '1' if the user wins, '2' if the computer wins.
     */
    public static int playRound() {
        int userNum, compNum, result;
        userNum = getUserInput();
        compNum = getCompInput();
        result = compareNums(userNum, compNum);
        return result;
    }

    /**
     * compareNums: compares the input of each side, and returns and displays the
     * result.
     * 
     * @param userNum an integer in the range [0, 2] that represents the input of
     *                the user.
     * @param compNum an integer in the range [0, 2] that represents the input of
     *                the computer.
     * @return 0 if it's a draw, 1 if the user wins, 2 if the computer wins.
     */
    public static int compareNums(int userNum, int compNum) {
        if (userNum == compNum) {
            System.out.println("The computer is " + (compNum == 0 ? "rock" : compNum == 1 ? "scissor" : "paper")
                    + ". You are " + (compNum == 0 ? "rock" : compNum == 1 ? "scissor" : "paper")
                    + " too. It is a draw.");
            return 0;
        } else if (userNum == 0) {
            if (compNum == 1) {
                System.out.println("The computer is scissor. You are rock. You won!");
                return 1;
            } else {
                System.out.println("The computer is paper. You are rock. You lose.");
                return 2;
            }
        } else if (userNum == 1) {
            if (compNum == 2) {
                System.out.println("The computer is paper. You are scissor. You won!");
                return 1;
            } else {
                System.out.println("The computer is rock. You are scissor. You lose.");
                return 2;
            }
        } else {
            if (compNum == 0) {
                System.out.println("The computer is rock. You are paper. You won!");
                return 1;
            } else {
                System.out.println("The computer is scissor. You are paper. You lose");
                return 2;
            }
        }
    }

    /**
     * getUserInput: prompts the user to enter a number in the range [0, 2]
     * representing a shape.
     * 
     * @return 0 if the user picks rock, 1 if the user picks scissor, 2 if the user
     *         picks paper.
     */
    public static int getUserInput() {
        int userInput;
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        do {
            if (flag) {
                System.out.println("Error: invalid input. Try again");
            }
            System.out.print("Select rock(0), scissor(1), or paper(2): ");
            userInput = input.nextInt();
            flag = true;
        } while (userInput < 0 || userInput > 2);
        return userInput;
    }

    /**
     * getCompInput: generates a random integer in the range [0, 2] representing a
     * shape.
     * 
     * @return integer in the range [0, 2].
     */
    public static int getCompInput() {
        return (int) (Math.random() * 3);
    }

    /**
     * displayResult: displays the final result of the game.
     * 
     * @param userWins The amount of user wins.
     * @param compWins The amount of computer wins.
     */
    public static void displayResult(int userWins, int compWins) {
        if (userWins > compWins)
            System.out.println("Game over! You are the winner!");
        else
            System.out.println("Game over! The Computer is the winner! Try again!");
    }
}
