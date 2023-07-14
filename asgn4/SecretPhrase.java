import javax.swing.JOptionPane;

public class SecretPhrase {
    static String[] phrases = { "hello world", "go team", "winter is coming", "wakanda forever" };

    /**
     * main: loops through the game, printing the current state at the beginning of
     * each loop.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int random = (int) (Math.random() * phrases.length - 1);
        String phrase = phrases[random];
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
                String.format("Congratulations!\nThe phrase is \"%s\"\nYour score is %.3f", phrase, score));
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
     * @return
     */
    public static char getInput(String phrase) {
        char guess;
        guess = JOptionPane.showInputDialog(null,
                String.format("Play our game - guess the letter\nEnter one letter\n%s", phrase)).charAt(0);
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
