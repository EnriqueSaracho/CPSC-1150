public class Problem10 {
    public static void main(String[] args) {
        int[] arr1 = { 5, 9, 20, 25 };
        int[] arr2 = { 4, 6, 8, 13, 15 };
        int key1 = 12;
        int key2 = 19;

        printArray(arr1);
        printArray(arr2);
        System.out.println();

        insertInArray(arr1, key1);
        insertInArray(arr2, key2);

        printArray(arr1);
        printArray(arr2);

    }

    public static void insertInArray(int[] arr, int n) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (n < arr[i] || i == arr.length - 1) {
                temp = arr[i];
                arr[i] = n;
                n = temp;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
