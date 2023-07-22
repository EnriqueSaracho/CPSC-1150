import java.util.Scanner;
import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printMatrix(matrix);
        System.out.println("Matrix cross result: " + matrixCross(matrix, 0));
    }

    // Print array method.
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // Print matrix method
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("}");
            System.out.println();
        }
    }

    /* Problem 1 */
    public static void sumUpToNum() {
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number: "));
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        JOptionPane.showMessageDialog(null, String.format("The sum of numbers up to %d is: %d", num, sum));
        input.close();
    }

    /* Problem 2 */
    public static void countVowels() {
        Scanner input = new Scanner(System.in);
        String str = JOptionPane.showInputDialog(null, "Enter a string:");
        int vowels = 0;
        char letter;
        for (int i = 0; i < str.length(); i++) {
            letter = Character.toUpperCase(str.charAt(i));
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
                vowels++;
        }
        JOptionPane.showMessageDialog(null, String.format("The number of vowels is: %d", vowels));
    }

    /* Problem 3 */
    public static void reverseNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int reverseNum = 0;
        while (num > 0) {
            reverseNum *= 10;
            reverseNum += num % 10;
            num /= 10;
        }
        System.out.println(reverseNum);
    }

    /* Problem 4 */
    public static void isPalindrome() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Is not palindrome");
                return;
            }
        }
        System.out.println("Is palindrome");
        input.close();
    }

    /* Problem 5 */
    public static int power(int x, int n) {
        int result = x;
        for (int i = 1; i < n; i++) {
            result *= x;
        }
        return result;
    }

    /* Problem 6 */
    public static void averageOfNums() {
        double[] list = new double[50];
        int i = 0;
        double num, sum = 0, avg;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number or 0 to end: "));
            if (num != 0) {
                list[i] = num;
                sum += num;
                i++;
            }
        } while (num != 0);
        avg = sum / (i);

        int closest = 0;
        for (i = 0; i < list.length; i++) {
            if (Math.abs(list[i] - avg) < Math.abs(list[closest] - avg))
                closest = i;
        }
        JOptionPane.showMessageDialog(null, avg);
        JOptionPane.showMessageDialog(null, list[closest]);
    }

    /* Problem 7 */
    public static void phraseAndLetter() {
        String phrase = JOptionPane.showInputDialog("Enter a phrase");
        char letter = JOptionPane.showInputDialog("Enter a letter").charAt(0);
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == letter) {
                JOptionPane.showMessageDialog(null, String.format("index: %d", i));
                return;
            }
        }
        JOptionPane.showMessageDialog(null, String.format("index: %d", -1));
    }

    /* Problem 8 */
    public static int mode(int[] arr) {
        int len = arr.length;
        int[] count = new int[len];
        for (int i = 0; i < len; i++) {
            count[i] = countTimes(arr, arr[i]);
        }
        int max = findMax(count);
        return arr[max];
    }

    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public static int countTimes(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    /* Problem 9 */
    public static void shuffleMatrix(int[][] matrix) {
        int a, b, temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                a = (int) (Math.random() * matrix.length);
                b = (int) (Math.random() * matrix[0].length);
                temp = matrix[i][j];
                matrix[i][j] = matrix[a][b];
                matrix[a][b] = temp;
            }
        }
    }

    /* Problem 10 */
    public static boolean matrixCross(int[][] matrix, int n) {
        int rowSum = 0, columSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == n)
                    rowSum += matrix[i][j];
                if (j == n)
                    columSum += matrix[i][j];
            }
        }
        if (rowSum == columSum)
            return true;
        return false;
    }
}