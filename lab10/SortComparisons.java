import java.util.Arrays;

public class SortComparisons {
    public static void main(String[] args) {
        System.out.printf("\n%10s%-25s\n", " ", "Average Number of Comparisons");
        System.out.printf("%-10s%12s%20s\n", "n", "Linear Search", "Binary Search");
        System.out.println("-------------------------------------------");

        for (int size = 10; size < 1000000; size *= 10) {
            int[] list = genArray(size);
            Arrays.sort(list);
            double avgLnS = averageLinear(list);
            double avgBS = averageBinary(list);

            System.out.printf("%-10d%-20.2f%-20.2f\n", size, avgLnS, avgBS);
        }

        // int[] list = { 2, 7, 11, 15, 22, 23, 30, 34, 35, 77 };

        // System.out.println("Linear search: " + averageLinear(list));
        // System.out.println("Binary search: " + averageBinary(list));
    }

    public static int[] genArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * size);
        }
        return arr;
    }

    public static int linearSeach(int[] arr, int num) {
        int comp = 0;
        for (int i = 0; i < arr.length; i++) {
            comp++;
            if (arr[i] == num) {
                return comp;
            }
        }
        return comp;
    }

    public static int binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        return binarySearch(arr, num, start, end, 0);
    }

    public static int binarySearch(int[] arr, int num, int start, int end, int comp) {
        if (start > end) {
            return comp;
        }
        int mid = (start + end) / 2;
        comp++;
        if (arr[mid] == num) {
            return comp;
        } else if (arr[mid] < num) {
            return binarySearch(arr, num, mid + 1, end, comp);
        } else {
            return binarySearch(arr, num, start, mid - 1, comp);
        }
    }

    public static double averageLinear(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += linearSeach(arr, arr[i]);
        }
        return (double) sum / arr.length;
    }

    public static double averageBinary(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += binarySearch(arr, arr[i]);
        }
        return (double) sum / arr.length;
    }

    // Temporary Method
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.println(element + " ");
        }
    }
}
