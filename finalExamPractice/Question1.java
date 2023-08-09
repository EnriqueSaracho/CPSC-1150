import java.util.Scanner;

public class Question1 {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);

        String num1str, num2str;
        System.out.print("Enter first number: ");
        num1str = input.nextLine();
        System.out.print("Enter second number: ");
        num2str = input.nextLine();

        int length;
        if (num1str.length() > num2str.length()) {
            char[] num1 = num1str.toCharArray();
            length = num1.length;
            char[] num2 = new char[length];
            int i = 0, j = 0;
            for (; i < length - num2str.length(); i++) {
                num2[i] = 0;
            }
            for (; i < length; i++, j++) {
                num2[i] = num2str.charAt(j);
            }
            printArray(num1);
            printArray(num2);
        } else {
            char[] num2 = num2str.toCharArray();
            length = num2.length;
            char[] num1 = new char[length];
            int i = 0, j = 0;
            for (; i < length - num1str.length(); i++) {
                num1[i] = 0;
            }
            for (; i < length; i++, j++) {
                num1[i] = num1str.charAt(j);
            }
            printArray(num1);
            printArray(num2);
        }

    }

    public static void printArray(char[] arr) {
        System.out.println();
        for (char element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
