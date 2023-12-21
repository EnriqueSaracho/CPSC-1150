import java.util.Scanner;

/**
 * Program name: B2D
 * Converts entered binary number to decimal
 * 
 * @author Enrique Saracho Felix
 * @since June 19, 2023
 * 
 */

public class B2D {
    /**
     * main: Prompts user to enter binary number, checks if the number contains a
     * radix point, then converts it to decimal
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaring variables
        String binNum;
        int decNum = 0, count, exp = 0;

        // Prompting and validating input
        do {
            System.out.print("Enter positive binary number: ");
            binNum = input.nextLine();
            if (binNum.charAt(0) == '0')
                System.out.println("Error: invalid input.");
        } while (binNum.charAt(0) == '0');

        count = binNum.length() - 1; // Setting count value

        // Doing base convertion
        while (count >= 0) {
            if (binNum.charAt(count) == '1')
                decNum += Math.pow(2, exp);
            count--;
            exp++;
        }

        System.out.printf("Decimal: %d", decNum); // Printing output

        input.close();
    }
}
