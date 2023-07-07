public class Test7 {
    public static void main(String[] args) {
        int[] source = { 1, 2, 3, 4, 5 };
        printArray(source);
        source = getReverseArray(source);
        printArray(source);

    }

    public static void printArray(int[] source) {
        int length = source.length;
        for (int i = 0; i < length; i++) {
            System.out.print(source[i] + " ");
        }
        System.out.println();
    }

    public static int[] getReverseArray(int[] source) {
        int length = source.length;
        int[] dest = new int[length];
        for (int i = 0; i < length; i++) {
            dest[i] = source[length - i - 1];
        }
        return dest;
    }

}
