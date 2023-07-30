import javax.swing.JOptionPane;
import java.io.File;
import java.util.Scanner;

/**
 * Program name: SecretPhrase
 * Allows the user to play a game in which the user tries to guess a random
 * phrase in the least amount of tries possible, displaying the phrase's letters
 * replaced by asterisks as a hint.
 * 
 * @author Enrique Saracho Felix
 * @since July 14, 2023
 * 
 */
public class SecretPhrase {
    static String[] phrases = new String[100];
    static int rounds;
    static float[] scores = new float[15];
    static String[] guessed = new String[15];

    /**
     * main: Loops through the game, until the user guesses all the letters
     * correctly. It also keeps track of the tries and calculates the score. Once
     * the user wins, it shows the word and the score.
     * 
     * @param args
     */
    public static void main(String[] args) throws Exception {
        if (args.length == 2 || args.length == 3) {
            rounds = Integer.parseInt(args[0]);
            if (args[1].equals("-1"))
                getPhrases();
            else if (args[1].equals("-f"))
                getPhrases(args[2]);
            else {
                System.out.println("Error: invalid input.");
                System.exit(1);
            }

            float sum = 0;
            for (int i = 0; i < rounds; i++) {
                playRound(i);
                sum += scores[i];
            }
            float avg = sum / rounds;

            printResults(avg);

        } else {
            System.out.println("Usage: java SecretPhrase rounds [-1 | -f filename]");
            System.out.printf("%-12s: a positive integer that represents the number of rounds for running program\n",
                    "rounds");
            System.out.printf("%-12s: randomly selects the targets from a list of phrases\n", "-1");
            System.out.printf("%-12s: randomly selects the targets from the filename\n", "-f filename");
            System.exit(1);
        }
    }

    /**
     * playRound: Runs a round of the guessing game by picking a random phrase from
     * the phrases global array, keeping track of the guesses, counting the tries
     * and calculating the score.
     * 
     * @param round
     * @return the score of the round.
     */
    public static void playRound(int round) {
        int random = (int) (Math.random() * getPhrasesLength(phrases));
        String ogPhrase = phrases[random];
        String phrase = ogPhrase.toUpperCase();
        char[] guesses = new char[50];
        int guess = 0;

        while (!replaceLetters(phrase, guesses).equals(phrase)) {
            guesses[guess] = getInput(replaceLetters(phrase, guesses), round);
            guess++;
        }

        float score = ((float) phrase.replace(" ", "").length() / (float) guess);

        JOptionPane.showMessageDialog(null,
                String.format("Round %d\nCongratulations!\nThe phrase is \"%s\"\nYour score is %.3f", round + 1,
                        ogPhrase, score));
        scores[round] = score;
        guessed[round] = ogPhrase;
    }

    /**
     * replaceLetters: Takes a frase and an array of guessed letters and replaces
     * the letters of the phrase that haven't been guessed with asterisks.
     * 
     * @return A string, the frase but with the unguessed values replaced by an
     *         asterisk.
     */
    public static String replaceLetters(String phrase, char[] guesses) {
        String replacedPhrase = "";
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 32) {
                replacedPhrase += ' ';
            } else if (findCharacter(phrase.charAt(i), guesses)) {
                replacedPhrase += phrase.charAt(i);
            } else {
                replacedPhrase += '*';
            }
        }
        return replacedPhrase;
    }

    /**
     * getInput: Prompts the user to enter a character guess and shows the current
     * state of the phrase.
     * 
     * @return A character enter by the user, transformed into uppercase.
     */
    public static char getInput(String phrase, int round) {
        char guess;
        guess = JOptionPane.showInputDialog(null,
                String.format("Round %d\nPlay our game - guess the letter\nEnter one letter\n%s", round + 1,
                        phrase.toUpperCase()))
                .charAt(0);
        guess = String.valueOf(guess).toUpperCase().charAt(0); // transform to uppercase.
        return guess;
    }

    /**
     * findCharacter: Searches for a character in an array of characters.
     * 
     * @param letter  The character.
     * @param guesses The array of characters.
     * @return 'true' if the character is in the array, 'false' if it's not.
     */
    public static boolean findCharacter(char letter, char[] guesses) {
        for (int i = 0; i < guesses.length; i++) {
            if (guesses[i] == 0)
                break;
            if (guesses[i] == letter)
                return true;
        }
        return false;
    }

    /**
     * getPhrases: fills the phrases global array with ten default phrases.
     */
    public static void getPhrases() {
        String[] defaultPhrases = { "Looks like rain", "Wind's howling", "Who woulda thunk", "Hello World",
                "Winter is coming", "Thanks bunches", "Hiking is fun", "Go team", "Hermit turtle", "Tall trees" };
        for (int i = 0; i < defaultPhrases.length; i++)
            phrases[i] = defaultPhrases[i];
    }

    /**
     * getPhrases: reads frases from file of name given as argument, and adds them
     * to phrases global array.
     * 
     * @throws Exception
     */
    public static void getPhrases(String fileName) throws Exception {
        File file = new File(fileName);

        if (!file.canRead()) {
            System.out.println("Error: permission to read from file denied");
            System.exit(1);
        }

        Scanner input = new Scanner(file); // Throws FileNotFoundException
        int i = 0;
        while (input.hasNext()) {
            String line = input.nextLine();
            phrases[i] = line;
            i++;
        }
        input.close();
    }

    /**
     * getPhrasesLength: Counts the number of elements inside the phrases global
     * array that are not null.
     * 
     * @param phrases
     * @return number of phrases.
     */
    public static int getPhrasesLength(String[] phrases) {
        int count = 0;
        int i = 0;
        while (phrases[i] != null) {
            count++;
            i++;
        }
        return count;
    }

    /**
     * printResults: Prints the results of the game in tabular form. A column for
     * the rounds, one for the phrase and another for the score. It also displays
     * the average score below the table.
     * 
     * @param avg
     */
    public static void printResults(float avg) {
        JOptionPane.showMessageDialog(null, "Check the console for the results.");
        System.out.printf("\n%6s %-50s %-6s\n", "Round", "Target phrase", "Score");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < rounds; i++)
            System.out.printf("%6d %-50s %2.2f\n", i + 1, guessed[i], scores[i]);
        System.out.println("------------------------------------------------------------------");
        System.out.printf("The average score is %2.2f\n", avg);
    }
}
