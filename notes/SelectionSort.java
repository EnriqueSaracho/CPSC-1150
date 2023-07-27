public class SelectionSort {
    public static void main(String[] args) {
        int[] myList = { 1, 5, -2, 7, 4 };
        printArray(myList);
        sortAscending(myList);
        printArray(myList);
    }

    public static void sortAscending(int[] list) {
        int min = list.length - 1;
        int temp;
        for (int i = list.length - 1; i > 0; i--) {
            for (int j = i; j >= 0; j--) {
                if (list[j] < list[min])
                    min = j;
            }
            temp = list[min];
            list[i] = list[min];
            list[min] = temp;
        }

    }

    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
