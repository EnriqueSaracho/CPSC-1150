package asgn2;

import java.lang.Math;

/**
 * Program name: Palindrome
 * Generates a random three-digit integer and determines if it's a palindrome.
 * 
 * @author Enrique Saracho Felix
 * @since June 10, 2023
 * 
 */

public class Palindrome {
    /**
     * main: Generates random number and determines if it's a palindrome number.
     */
    public static void main(String[] args) {
        int num = (int) (Math.random() * 900) + 100;
        if (num % 10 == num / 100)
            System.out.printf("%d is a palindrome.", num);
        else
            System.out.printf("%d is not a palindrome.", num);
    }
}
