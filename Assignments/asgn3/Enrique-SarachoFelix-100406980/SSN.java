import java.util.Scanner;

/**
 * Program name: SSN
 * Validates the format of a Social Security Number entered by the user.
 * 
 * @author Enrique Saracho Felix
 * @since July 1, 2023
 * 
 */
public class SSN {
    /**
     * main: Prompts user to enter social security number and prints a correct or
     * incorrect message based on the format of the input.
     */
    public static void main(String[] args) {
        String ssn;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        ssn = input.nextLine();
        if (validation1(ssn) && validation2(ssn) && validation3(ssn) && validation4(ssn) && validation5(ssn))
            System.out.printf("%s is a valid social security number", ssn);
        else
            System.out.printf("%s is an invalid social security number", ssn);
    }

    /**
     * validation1: Checks that the length of the string is correct.
     * 
     * @param ssn The ssn entered by the user in type String.
     * @return 'true' if the length is 11, 'false if it ins't.
     * 
     *         precondition: the main method called this method with the ssn entered
     *         by the user as the argument.
     *         postcondition: the result of this method is combined with the other
     *         validation methods to figure out if the format of the ssn is correct
     *         and inform the user.
     */
    public static boolean validation1(String ssn) {
        if (ssn.length() != 11)
            return false;
        return true;
    }

    /**
     * validation2: Checks if the values in the ssn are digits.
     * 
     * @param ssn The ssn entered by the user in type String.
     * @return 'true' if the values are digits (excluding the indexes for the
     *         dashes), 'false' they aren't.
     * 
     *         precondition: the main method called this method with the ssn entered
     *         by the user as the argument.
     *         postcondition: the result of this method is combined with the other
     *         validation methods to figure out if the format of the ssn is correct
     *         and inform the user.
     */
    public static boolean validation2(String ssn) {
        for (int i = 0; i < ssn.length(); i++) {
            if (i == 3 || i == 7) {
                continue;
            }
            if (ssn.charAt(i) < 48 || ssn.charAt(i) > 57)
                return false;
        }
        return true;
    }

    /**
     * validation3: Checks that the three sets of digits are separated by dashes.
     * 
     * @param ssn The ssn entered by the user in type String.
     * @return 'true' if the characters at 3 and 7 are dashes, 'false' if they
     *         aren't.
     * 
     *         precondition: the main method called this method with the ssn entered
     *         by the user as the argument.
     *         postcondition: the result of this method is combined with the other
     *         validation methods to figure out if the format of the ssn is correct
     *         and inform the user.
     */
    public static boolean validation3(String ssn) {
        if (ssn.charAt(3) != '-' || ssn.charAt(7) != '-')
            return false;
        return true;
    }

    /**
     * validation4: Checks that the first digit isn't zero.
     * 
     * @param ssn The ssn entered by the user in type String.
     * @return 'true' if the first digit isn't zero, 'false' if it is.
     * 
     *         precondition: the main method called this method with the ssn entered
     *         by the user as the argument.
     *         postcondition: the result of this method is combined with the other
     *         validation methods to figure out if the format of the ssn is correct
     *         and inform the user.
     */
    public static boolean validation4(String ssn) {
        if (ssn.charAt(0) == '0')
            return false;
        return true;
    }

    /**
     * validation5: Checks if the second set of digits is larger than 100.
     * 
     * @param ssn The ssn entered by the user in type String.
     * @return 'true' if the second set of digits are larger than 100, 'false' if
     *         they aren't.
     * 
     *         precondition: the main method called this method with the ssn entered
     *         by the user as the argument.
     *         postcondition: the result of this method is combined with the other
     *         validation methods to figure out if the format of the ssn is correct
     *         and inform the user.
     */
    public static boolean validation5(String ssn) {
        if (ssn.charAt(4) < '1')
            return false;
        if (ssn.charAt(4) == '1' && ssn.charAt(5) == '0' && ssn.charAt(6) == '0')
            return false;
        return true;
    }
}
