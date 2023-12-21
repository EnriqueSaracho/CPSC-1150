package lab04;

import java.util.Scanner;

/**
 * Program name: LogicalOps
 * This program determines whether a value entered by the user is divisible by 5
 * 'and' 6, 5 'or' 6, and 5 'or' 6 but 'not both'.
 * 
 * @author Enrique Saracho Felix
 * @since June 5, 2023
 * 
 */
public class LogicalOps {
    /**
     * main: takes an integer and determines if the value is divisible by 5 and 6, 5
     * or 6, and 5 or 6 but not both.
     */
    public static void main(String[] args) {
        // Declare variables.
        int num;
        boolean cond1 = false, cond2 = false, cond3 = false;
        // Prompt user to input an integer value.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        num = input.nextInt();
        // Determine conditions.
        if (num % 5 == 0 && num % 6 == 0)
            cond1 = true;
        if (num % 5 == 0 || num % 6 == 0)
            cond2 = true;
        if (num % 5 == 0 ^ num % 6 == 0)
            cond3 = true;
        // Display result.
        System.out.println("Is " + num + " divisible by 5 and 6? " + cond1);
        System.out.println("Is " + num + " divisible by 5 or 6? " + cond2);
        System.out.println("Is " + num + " divisible by 5 or 6, but not both? " + cond3);

        input.close();
    }
}
