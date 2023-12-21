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
        System.out.print(isSumEqual(a, b));

        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
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

    /**
     * 
     * @param a
     * @param b
     * @return boolean value
     * 
     *         precondition: a and b have been initialized.
     *         postcondition: main will print the return of this method.
     */
    public static boolean isSumEqual(int a, int b) {
        return (sumOfEven(a) == sumOfEven(b));
    }

    /**
     * 
     * @param num
     * @return sum of even digits of num.
     * 
     *         precondition: a or b have been used as the argument when calling this
     *         function.
     *         postcondition: the sum of even digits for a and be are calculated and
     *         compared in isSumEqual().
     */
    public static int sumOfEven(int num) {
        int sum = 0;
        int digit;
        while (num > 0) {
            digit = num % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            num /= 10;
        }
        return sum;
    }
}
