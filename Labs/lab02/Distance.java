import java.util.Scanner;
import java.lang.Math;

/**
 * Program Name: Distance
 * 
 * @author Enrique Saracho Felix
 *         Course: CPSC 1150
 *         Date: 17/05/2023
 */
public class Distance {
    /**
     * main: The main program that calculates the distance of two points entered by
     * the user.
     */
    public static void main(String[] args) {
        double x1, y1, x2, y2, distance; // declare the variables
        Scanner input = new Scanner(System.in); // create scanner object
        System.out.print("Enter the value in x of the first point: "); // prompr the user to enter value
        x1 = input.nextDouble(); // assign the user input into variable
        System.out.print("Enter the value in y of the first point: ");
        y1 = input.nextDouble();
        System.out.print("Enter the value in x of the second point: ");
        x2 = input.nextDouble();
        System.out.print("Enter the value in y of the second point: ");
        y2 = input.nextDouble();
        distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // calculate distance
        System.out
                .println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + " ," + y2 + ") is: " + distance); // return
                                                                                                                        // distance
                                                                                                                        // to
                                                                                                                        // user
        input.close(); // close the scanner object
    }
}
