package asgn1;

import java.lang.Math;
import java.util.Scanner;

/**
 * Program Name: WindChillIndex
 * program calculates the wind-chill index
 * 
 * @author Enrique Saracho Felix
 * @since May 26, 2023
 */
public class WindChillIndex {
    /**
     * main: The main program calculates the wind-chill index with the temperature
     * and wind speed entered by the user.
     */
    public static void main(String[] args) {
        int Ta, V, Twc; // Declare variables
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates the wind-chill index");
        System.out.println("");
        System.out.print("Enter the temperature in Celsius: "); // Input temperature
        Ta = input.nextInt();
        System.out.print("Enter the wind speed in km/h: "); // Input wind speed
        V = input.nextInt();
        Twc = (int) (13.112 + 0.6215 * Ta - 11.37 * Math.pow(V, 0.16) + 0.3965 * Ta * Math.pow(V, 0.16)); // Calculate
                                                                                                          // wind-chill
                                                                                                          // index
        System.out.println("The wind chill index is: " + Twc); // display wind-chil index

        input.close();
    }
}
