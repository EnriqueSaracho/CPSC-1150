import java.util.Arrays;

/**
 * Program name: SortCoparisons
 * Displays the average number of comparisons linear and binary search
 * algorithms make to find an element in different sizes of lists.
 * 
 * @author Enrique Saracho Felix
 * @since July 28, 2023
 * 
 */
public class SortComparisons {
    /**
     * main: loops through each of the different values of sizes of lists to make
     * comparisons and prints the results in tabular form.
     * 
     * @param args
     */
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
    }

    /**
     * genArray: generates an array of integers. The size of the array is determined
     * by the argument, as well as the size of the random integers in it.
     * 
     * @param size
     * @return array of integers of size 'size'.
     */
    public static int[] genArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = (int) (Math.random() * size);
        return arr;
    }

    /**
     * linearSearch: Calculates the comparisons needed to find the argument number
     * inside the argument array by using linear search algorithm.
     * 
     * @param arr
     * @param num
     * @return an integer number representing the number of comparisons needed to
     *         find 'num' in 'arr'.
     */
    public static int linearSeach(int[] arr, int num) {
        int comp = 0;
        for (int i = 0; i < arr.length; i++) {
            comp++;
            if (arr[i] == num)
                return comp;
        }
        return comp;
    }

    /**
     * binarySearch: creates two arguments ('start' and 'end') and calls the next
     * binarySearch method, along with 0 as the number of comparisons, to start a
     * recursive loop. Returns the comparisons needed to find the argument
     * number inside the argument array by using binary search algorithm.
     * 
     * @param arr
     * @param num
     * @return an integer number representing the number of comparisons needed to
     *         find 'num' in 'arr'.
     */
    public static int binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        return binarySearch(arr, num, start, end, 0);
    }

    /**
     * linearSearch: Calculates the comparisons needed to find the argument number
     * inside the argument array by using linear search algorithm.
     * 
     * @param arr   array of integers.
     * @param num   integer, values being search.
     * @param start integer, first element in the current search space of the array.
     * @param end   integer, last element in the current search space of the array.
     * @return an integer number representing the number of comparisons needed to
     *         find 'num' in 'arr'.
     */
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

    /**
     * averageLinear: Calculates the average number of comparisons to find every
     * element in an array using linear search algorithm.
     * 
     * @param arr array of integers.
     * @return double, average number of comparisons.
     */
    public static double averageLinear(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += linearSeach(arr, arr[i]);
        }
        return (double) sum / arr.length;
    }

    /**
     * averageLinear: Calculates the average number of comparisons to find every
     * element in an array using linear search algorithm.
     * 
     * @param arr array of integers.
     * @return double, average number of comparisons.
     */
    public static double averageBinary(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += binarySearch(arr, arr[i]);
        }
        return (double) sum / arr.length;
    }
}
