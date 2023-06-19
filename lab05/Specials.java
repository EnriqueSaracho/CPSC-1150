/**
 * Program name: Specials
 * Displays special numbers between 10 and 1000 (exclusive). Special number
 * being one that the sum of its odd position digits equals the sum of its even
 * position digits
 * 
 * @author Enrique Saracho Felix
 * @since June 19, 2023
 * 
 */
public class Specials {
    /**
     * main: Finds and displays in tabular format the special numbers between 10 and
     * 1000 (exclusive)
     */
    public static void main(String[] args) {

        // Declaring variables and and looping through the range
        for (int i = 11, j = 0; i < 1000; i++) {

            // Validating and displaying special number
            if (i / 100 + i % 10 == (i / 10) % 10) {
                System.out.printf("%3d ", i);
                j++;
            }

            // Printing new line
            if (j > 6) {
                System.out.printf("%n");
                j = 0;
            }
        }
    }
}
