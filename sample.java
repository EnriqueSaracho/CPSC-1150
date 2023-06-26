/**
 * Program name:
 * (program description/purpose)
 * 
 * @author Enrique Saracho Felix
 * @since June 2, 2023
 * 
 */

public class sample {
    /**
     * main: calls sampleMethod() to print a message.
     */
    public static void main(String[] args) {
        sampleMethod(
                "This program contains the blueprint for the internal documentation of java programs in CPSC 1150.");
    }

    /**
     * sampleMethod: gets a message from the main method and prints it.
     * 
     * @param message
     * 
     *                precondition: the method is called in the main method with a
     *                string as an argument.
     *                postcondition: the method prints the message passed as the
     *                argument.
     */
    public static void sampleMethod(String message) {
        System.out.println(message);
    }
}
