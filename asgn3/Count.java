import java.util.Scanner;

/**
 * Program name: Count
 * Gets a string from the user, counts and displays the number of uppercase
 * letters and digits in the string.
 * 
 * @author Enrique Saracho Felix
 * @since July 7, 2023
 * 
 */

public class Count {
    /**
     * main: Prompts user to enter a string and displays the number of uppercase
     * letters and digits.
     */
    public static void main(String[] agrs) {
        String frase; // Declares variable.

        // Reads input from user and initializes variable.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        frase = input.nextLine();

        // Prints output.
        System.out.printf("The number of uppercase letters is %d\nThe number of digits is %d", countUpperCase(frase),
                countDigits(frase));
    }

    /**
     * countUpperCase: gets a string and counts the number of uppercase letters.
     * 
     * @param frase the string entered by the user.
     * @return an integer value representing the amount of uppercase letters.
     * 
     *         precondition: the main method recieves a string from the user which
     *         uses as an argument for this method.
     *         postcondition: the method returns the amount or uppercase letters to
     *         the main, which then prints it.
     */
    public static int countUpperCase(String frase) {
        int count = 0; // Sets counter.

        // Counts uppercase letters.
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) >= 65 && frase.charAt(i) <= 90)
                count++;
        }

        return count;
    }

    /**
     * countDigits: gets a string and counts the number of digits.
     * 
     * @param frase the string entered by the user.
     * @return an integer value representing the amount of digits.
     * 
     *         precondition: the main method recieves a string from the user which
     *         uses as an argument for this method.
     *         postcondition: the method returns the amount or digits to
     *         the main, which then prints it.
     */
    public static int countDigits(String frase) {
        int count = 0; // Sets counter.

        // Counts digits.
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) >= 48 && frase.charAt(i) <= 57)
                count++;
        }

        return count;
    }

}
