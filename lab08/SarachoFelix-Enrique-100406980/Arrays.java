import java.util.Scanner;

/**
 * Program name: Array
 * Prompts the user to enter 5 double values and displays the average.
 * 
 * @author Enrique Saracho Felix
 * @since July 7, 2023
 * 
 */
public class Arrays {
    /**
     * main: Prompts the user to enter 5 double values, stores them in an array,
     * passes it as an argument to a function that returns the average and finaly
     * displays that average.
     */
    public static void main(String[] args) {
        double[] myArray = new double[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 double values:");
        for (int i = 0; i < 5; i++) {
            myArray[i] = sc.nextDouble();
        }

        System.out.printf("Average = %.2f", average(myArray));

        sc.close();
    }

    /**
     * average: gets an array of integers as an argument and returns the average.
     * 
     * @param array An array of integers, of length 5.
     * @return an integer value equal to the average of the items in the array.
     */
    public static int average(int[] array) {
        // System.out.println("int average() in use...");
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum / array.length;
    }

    /**
     * average: gets an array of doubles as an argument and returns the average.
     * 
     * @param array An array of doubles, of length 5.
     * @return an double value equal to the average of the items in the array.
     */
    public static double average(double[] array) {
        // System.out.println("double average() in use...");
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum / array.length;
    }
}