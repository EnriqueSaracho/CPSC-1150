public class Exercise3 {
    public static void main(String[] args) {
        String word = "abcd";
        System.out.println(word);
        String drow = reverseDisplay(word);
        System.out.println(drow);
    }

    /**
     * reverseDisplay: reverses a word by taking its last value to a new string
     * recursively.
     * 
     * @param value a string.
     * @return a string with the characters of 'value' in reversed order.
     */
    public static String reverseDisplay(String value) {
        String reverse = "";
        reverse += value.charAt(value.length() - 1);
        value = value.substring(0, value.length() - 1);
        if (value != "")
            reverse += reverseDisplay(value);
        return reverse;
    }
}
