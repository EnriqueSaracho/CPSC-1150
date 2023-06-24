import java.util.Scanner;

/**
 * Program name: SumDigits
 * Returns a boolean value representing if the sum of even digits for each of
 * two numbers entered by the user is equal
 * 
 * @author Enrique Saracho Felix
 * @since June 26, 2023
 * 
 */
public class SumDigits {
    /**
     * main: Recieves input from user and displays the final output.
     */
    public static void main(String[] args) {
        int a, b;
        a = getData();
        b = getData();
        // return isSumEqual(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /**
     * getData: reads, validates, and returns to main, input from the user.
     * 
     * @return positive integer.
     * 
     *         precondition: a and b variables are declared before calling this
     *         method.
     *         postcondition: returned value will be set to a and b.
     */
    public static int getData() {
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        int num;
        do {
            if (flag) {
                System.out.println("Error: invalid input. Input must be a positive integer");
            }
            System.out.print("Enter a positive integer: ");
            num = input.nextInt();
            flag = true;
        } while (num < 0);
        return num;
    }
}
