/**
 * Program name: PalindromePrime
 * Displays in tabular format the first 100 numbers that are both prime and
 * palindrome.
 * 
 * @author Enrique Saracho Felix
 * @since July 1, 2023
 * 
 */
public class PalindromePrime {
    /**
     * main: loops through every number from 2 until it prints 100 that check the
     * condition. It also prints a new line every 10 numbers printed.
     */
    public static void main(String[] args) {
        int count = 100, lineCount = 0, num = 2;
        while (count > 0) {
            while (lineCount < 10) {
                if (isPrime(num) && isPalindrome(num)) {
                    System.out.printf("%-5d ", num);
                    count--;
                    lineCount++;
                }
                num++;
            }
            System.out.println();
            lineCount = 0;
        }
    }

    /**
     * isPrime: Checks if argument number is a prime number.
     * 
     * @param num
     * @return 'true' if the number is prime, 'false' if it isn't.
     * 
     *         precondition: the main method is iterating through every number and
     *         passes each one as an argument to this method.
     *         postcondition: the return together with isPalindrome's return will
     *         decide if the number will be printed
     *         or not.
     */
    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    /**
     * isPalindrome: Checks if the argument number is a palindrome.
     * 
     * @param num
     * @return 'true' if the number is a palindrome, 'false' if it isn't.
     * 
     *         precondition: the main method is iterating through every number and
     *         passes each one as an argument to this method.
     *         postcondition: the return together with isPalindrome's return will
     *         decide if the number will be printed
     *         or not.
     */
    public static boolean isPalindrome(int num) {
        int normalNum = num, reverseNum = 0;
        while (normalNum > 0) {
            reverseNum = reverseNum * 10 + normalNum % 10;
            normalNum /= 10;
        }
        if (reverseNum == num)
            return true;
        return false;
    }
}
