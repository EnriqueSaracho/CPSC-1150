package lab04;

import java.util.Scanner;

/**
 * Program name:
 * (program description/purpose)
 * 
 * @author Enrique Saracho Felix
 * @since June 2, 2023
 * 
 */
public class Sort3 {
    /**
     * main: takes three integer values as input, sorts them in ascending order and
     * displays them.
     */
    public static void main(String[] args) {
        int a, b, c; // Declared variables.
        Scanner input = new Scanner(System.in);
        System.out.println("This program takes three integer values and sorts them in ascending order.");
        // Takes input from user.
        System.out.print("Enter first value: ");
        a = input.nextInt();
        System.out.print("Enter second value: ");
        b = input.nextInt();
        System.out.print("Enter third value: ");
        c = input.nextInt();
        // Sorts and displays in ascending order.
        if (a < b) {
            if (a < c) {
                System.out.println(a);
                if (b < c) {
                    System.out.println(b);
                    System.out.println(c);
                } else {
                    System.out.println(c);
                    System.out.println(b);
                }
            } else {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }
        } else {
            if (b < c) {
                System.out.println(b);
                if (a < c) {
                    System.out.println(a);
                    System.out.println(c);
                } else {
                    System.out.println(c);
                    System.out.println(a);
                }
            } else {
                System.out.println(c);
                System.out.println(b);
                System.out.println(a);
            }
        }
        input.close();
    }
}
