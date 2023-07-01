import java.util.Scanner;

/**
 * Program name: WarGame
 * Simulates a game of cards where the user goes against the computer.
 * 
 * @author Enrique Saracho Felix
 * @since July 1, 2023
 * 
 */
public class WarGame {
	/**
	 * main: runs the game for 10 rounds while keeping track of the score.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int ROUND = 10;
		int user, comp, score = 0;
		for (int r = 1; r < ROUND + 1; ++r) {
			comp = genInput();
			user = getInput(scan);
			printRoundInfo(r, user, comp);
			score = printRoundResult(score, user, comp);
		}
		System.out.println("End of Game!");
		scan.close();
	}

	/**
	 * getInput: prompts user to enter number and validates it.
	 * 
	 * @param input The Scanner object that allows the method to read the user's
	 *              input.
	 * @return an integer between 1 and 52 (inclusive).
	 */
	public static int getInput(Scanner input) {
		int user;
		boolean flag = false;
		do {
			if (flag) {
				System.out.println("Error: invalid input. Try again");
			}
			System.out.print("==> Enter your card: ");
			user = input.nextInt();
			flag = true;
		} while (user < 1 || user > 52);
		return user;
	}

	/**
	 * getInput: generates a random number between 1 and 52.
	 * 
	 * @return an integer between 1 and 52.
	 */
	public static int genInput() {
		int comp = (int) (Math.random() * 52) + 1;
		return comp;
	}

	/**
	 * printRoundInfo: prints the round number, the computer and the user's card.
	 * 
	 * @param r    the round number.
	 * @param user the user's card.
	 * @param comp the computer's card.
	 */
	public static void printRoundInfo(int r, int user, int comp) {
		System.out.print("R" + r + ": ");
		System.out.print("Computer card is " + getRank(comp) + " of " + getSuit(comp));
		System.out.println("; User card is " + getRank(user) + " of " + getSuit(user));
	}

	/**
	 * printRoundResult: prints the result of the game and updates the score.
	 * 
	 * @param score the user's score.
	 * @param user  the user's card/number.
	 * @param comp  the computer's card/number.
	 * @return the user's score.
	 */
	public static int printRoundResult(int score, int user, int comp) {
		int winner = findWinner(user, comp);
		switch (winner) {
			case 0:
				score *= 2;
				System.out.println("It’s tie – user score is " + score);
				break;
			case 1:
				score += 1;
				System.out.println("User wins – user score is " + score);
				break;
			default:
				System.out.println("Computer wins – user score is " + score);
				break;
		}
		return score;
	}

	/**
	 * findWinner: compares the user's and computer's card/number and finds the
	 * winner.
	 * 
	 * @param user the user's card/number
	 * @param comp the computer's card/number
	 * @return 0 if its a tie, 1 if the user wins, -1 if the computer wins.
	 */
	public static int findWinner(int user, int comp) {
		int userCard, compCard;
		userCard = (user - 1) % 13 + 1;
		compCard = (comp - 1) % 13 + 1;
		if (userCard == compCard)
			return 0;
		else if (userCard > compCard)
			return 1;
		else
			return -1;
	}

	/**
	 * getRank: calculates the rank of the card based on the number from 1 to 52.
	 * 
	 * @param card the user's card/number.
	 * @return a String displaying the rank of the card.
	 */
	public static String getRank(int card) {
		String rank;
		int num = (card - 1) % 13 + 1;
		switch (num) {
			case 1:
				rank = "Ace";
				break;
			case 10:
				rank = "10";
				break;
			case 11:
				rank = "Jack";
				break;
			case 12:
				rank = "Queen";
				break;
			case 13:
				rank = "King";
				break;
			default:
				rank = Integer.toString(num);
		}
		return rank;
	}

	/**
	 * getSuit: calculates the suit of the card based on the number from 1 to 52.
	 * 
	 * @param card the user's card/number.
	 * @return a String displaying the rank of the card.
	 */
	public static String getSuit(int card) {
		if (card < 14)
			return "Hearts";
		else if (card < 27)
			return "Diamonds";
		else if (card < 40)
			return "Clubs";
		else
			return "Spades";
	}

}