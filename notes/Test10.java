import java.util.Arrays;

public class Test10 {
    public static void main(String[] args) {
        int[] myList = { 9, 4, 2, 7 };
        printArray(myList);
        Arrays.fill(myList, 1, 3, 0);
        printArray(myList);
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
