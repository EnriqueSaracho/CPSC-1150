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
    static int rounds = 5;

    /**
     * main: Loops through the game, until the user guesses all the letters
     * correctly. It also keeps track of the tries and calculates the score. Once
     * the user wins, it shows the word and the score.
     * 
     * @param args
     */
    public static void main(String[] args) throws Exception {
        getPhrases("./Phrases.txt");

        float[] scores = new float[rounds];
        float sum;

        playRound(1);
    }

    /**
     * playRound: Runs a round of the guessing game by picking a random phrase from
     * the phrases global array, keeping track of the guesses, counting the tries
     * and calculating the score.
     * 
     * @param round
     * @return the score of the round.
     */
    public static float playRound(int round) {
        int random = (int) (Math.random() * getPhrasesLength(phrases));
        String phrase = phrases[random].toUpperCase();
        char[] guesses = new char[50];
        int guess = 0;

        while (!replaceLetters(phrase, guesses).equals(phrase)) {
            guesses[guess] = getInput(replaceLetters(phrase, guesses), round);
            guess++;
        }

        float score = ((float) phrase.replace(" ", "").length() / (float) guess);

        JOptionPane.showMessageDialog(null,
                String.format("Round %d\nCongratulations!\nThe phrase is \"%s\"\nYour score is %.3f", round,
                        phrases[random], score));
        return score;
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
                String.format("Round %d\nPlay our game - guess the letter\nEnter one letter\n%s", round,
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

    // TODO: External documentation
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

    // TODO: Erase this one
    // public static void printPhrases(String[] phrases) {
    // for (int phrase = 0; phrase < getPhrasesLength(phrases); phrase++) {
    // System.out.println(phrases[phrase]);
    // }
    // }

    // TODO: External documentation
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
}
