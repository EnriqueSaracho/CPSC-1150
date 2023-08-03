public class FinalExamPractice {
    // num1 236598745632
    // num2 2453254365546764765
    public static void main(String[] args) {
        // String num1String = "236598745632";
        // String num2String = "2453254365546764765";

        System.out.println(findLetters("Test", "See"));
        System.out.println();
        System.out.println(findLetters("Police", "Oil"));
        System.out.println();
        System.out.println(findLetters("Stamp", "sample"));
        System.out.println();
        System.out.println(findLetters("teas", "seats"));

    }

    // public static int[] add(String n1, String n2) {
    // // TODO: it's easier to turn each string argument into arrays.
    // int len = (n1.length() > n2.length() ? n1.length() + 1 : n2.length() + 1);
    // byte[] arr = new byte[len];
    // byte carry = 0;
    // int i, j, k;
    // for (i = n1.length() - 1, j = n2.length() - 1, k = len - 1; i > -1 && j > -1;
    // i--, j--, k--) {
    // byte sum = carry + (n1.charAt(i) - '0') + (n2.charAt(j) - '0');
    // carry = sum / 10;
    // arr[k] = sum % 10;
    // }
    // if (i < 0 && j > 0)
    // for (; j > -1; j--, k--) {
    // arr[k] = carry + (n2.charAt(j) - '0');
    // carry = 0;
    // }
    // else if (j < 0 && i > 0)
    // for (; i > -1; i--, k--) {
    // arr[k] = carry + (n2.charAt(i) - '0');
    // carry = 0;
    // }
    // arr[k] = carry;
    // }

    public static boolean findLetters(String str1, String str2) {
        char[] str1Arr = stringToArray(str1);
        System.out.println("- " + str1); // console log
        System.out.println("- " + str2); // console log
        int count = 0;
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1Arr.length; j++) {
                if (str1Arr[j] == Character.toUpperCase(str2.charAt(i))) {
                    str1Arr[j] = '*';
                    count++;
                    break;
                }
            }
        }
        System.out.println("Counter: " + count); // console log
        if (count == str2.length())
            return true;
        else
            return false;
    }

    public static char[] stringToArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.toUpperCase(str.charAt(i));
        }
        return arr;
    }
}
