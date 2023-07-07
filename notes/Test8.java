public class Test8 {
    public static void main(String[] agrs) {
        int[][] myArray = {
                { 1, 2, 3 },
                { 2, 4, 5 },
                { 6, 7, 8 },
                { 9, 10, 11 },
                { 12, 13, 14 }
        };

        printArray(sumOfColumns(myArray));
    }

    public static void printArray(int[] source) {
        int length = source.length;
        for (int i = 0; i < length; i++) {
            System.out.print(source[i] + " ");
        }
        System.out.println();
    }

    public static int[] sumOfColumns(int[][] source) {
        int[] result = { 0, 0, 0 };
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[j].length; j++) {
                result[j] += source[i][j];
            }
        }
        return result;
    }
}
