import javax.swing.JOptionPane;

/**
 * Program name: SecretPhrase
 * Allows the user to play a game in which the user tries to guess a random
 * phrase in the least amount of tries posible, displaying the phrase's letters
 * replaced by asterisks as a hint.
 * 
 * @author Enrique Saracho Felix
 * @since July 14, 2023
 * 
 */
public class SecretPhrase {
    static String[] phrases = { "Hello World", "Go team", "Winter is coming", "Wakanda forever", "Vancouver",
            "Hiking is fun", "Tall Trees", "Hermit Turtle", "Mexico", "Canada" };

    /**
     * main: Loops through the game, until the user guesses all the letters
     * correctly. It also keeps track of the tries and calculates the score. Once
     * the user wins, it shows the word and the score.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int random = (int) (Math.random() * phrases.length);
        String phrase = phrases[random].toUpperCase();
        char[] guesses = new char[50];
        int guess = 0;
        int tries = 0;

        while (!replaceLetters(phrase, guesses).equals(phrase)) {
            guesses[guess] = getInput(replaceLetters(phrase, guesses));
            guess++;
            tries++;
        }

        float score = ((float) phrase.replace(" ", "").length() / (float) tries);

        JOptionPane.showMessageDialog(null,
                String.format("Congratulations!\nThe phrase is \"%s\"\nYour score is %.3f", phrases[random], score));
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
    public static char getInput(String phrase) {
        char guess;
        guess = JOptionPane.showInputDialog(null,
                String.format("Play our game - guess the letter\nEnter one letter\n%s", phrase.toUpperCase()))
                .charAt(0);
        guess = String.valueOf(guess).toUpperCase().charAt(0); // transform to uppercase.
        JOptionPane.showMessageDialog(null, guess);
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
            if (guesses[i] == 0) {
                break;
            }
            if (guesses[i] == letter) {
                return true;
            }
        }
        return false;
    }
}
