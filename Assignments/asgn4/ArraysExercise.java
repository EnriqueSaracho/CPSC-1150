import javax.swing.JOptionPane;

/**
 * Program name: ArrayExercise
 * This program can create arrays based on the number of elements and values
 * specified by the user. It also has methods for displaying it, finding its
 * maximum and minimum values, the indexes for those values, checking if the
 * arrays are sorted in ascending or descending order, and more.
 * 
 * @author Enrique Saracho Felix
 * @since July 9, 2023
 * 
 */

public class ArraysExercise {
    /**
     * main: Calls every method in the program to create and work with arrays.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] arr1 = getArray(); // Calling getArray().
        printArray(arr1); // Calling printArray().

        // Calling findMax().
        JOptionPane.showMessageDialog(null, String.format("Maximum: %d", findMax(arr1)));
        // Calling findMin().
        JOptionPane.showMessageDialog(null, String.format("Minimum: %d", findMin(arr1)));

        // Calling findMaxIndex().
        JOptionPane.showMessageDialog(null, String.format("First appearence of Maximum: index %d", findMaxIndex(arr1)));
        // Calling findMinIndex().
        JOptionPane.showMessageDialog(null, String.format("Last appearence of Minimum: index %d", findMinIndex(arr1)));

        // Calling isSortedAscend().
        JOptionPane.showMessageDialog(null, String.format("Array sorted in ascending order: %b", isSortedAscend(arr1)));

        // Calling isSortedDescend().
        JOptionPane.showMessageDialog(null,
                String.format("Array sorted in descending order: %b", isSortedDescend(arr1)));

        // Calling swapNeighbor().
        swapNeighbor(arr1);
        JOptionPane.showMessageDialog(null, "After swapNeighbor:");
        printArray(arr1);

        // Calling merge().
        int[] arr2 = getArray();
        printArray(arr2);
        printArray(merge(arr1, arr2));
    }

    /**
     * getArray: Creates an array by asking the user for the array size, then
     * initializing it with values entered by the user.
     * 
     * @return An array of integers.
     */
    public static int[] getArray() {
        int n;
        boolean error = false;

        do {
            if (error) {
                JOptionPane.showMessageDialog(null, "Invalid input:\nThe value has to be as positive integer", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the size of the array:"));
            error = true;
        } while (n <= 0);

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer
                    .parseInt(JOptionPane.showInputDialog(null, String.format("Enter element %d of the array", i)));
        }

        return array;
    }

    /**
     * printArray: Takes and array as an argument and prints it in tabular format.
     * 
     * @param array
     */
    public static void printArray(int[] array) {
        int n = array.length;
        String elements = "";

        for (int i = 0; i < n; i++) {
            elements += String.format("%d : %-5d\n", i, array[i]);
        }

        JOptionPane.showMessageDialog(null, String.format("Array:\n%s", elements));
    }

    /**
     * findMax: Takes an array as an argument and finds its maximum value.
     * 
     * @param array
     * @return An integer representing the element in the array with the maximum
     *         value.
     */
    public static int findMax(int[] array) {
        int max = array[0];

        for (int i : array) {
            if (i > max)
                max = i;
        }

        return max;
    }

    /**
     * findMin: Takes an array as an argument and finds its minimum value.
     * 
     * @param array
     * @return An integer representing the element in the array with the minimum
     *         value.
     */
    public static int findMin(int[] array) {
        int min = array[0];

        for (int i : array) {
            if (i < min)
                min = i;
        }

        return min;
    }

    /**
     * findMaxIndex: Takes an array as argument and finds the first index at which
     * the maximum value of the array is.
     * 
     * @param array
     * @return An integer representing an index of the array.
     */
    public static int findMaxIndex(int[] array) {
        int n = array.length;
        int max = findMax(array);

        for (int i = 0; i < n; i++) {
            if (array[i] == max)
                return i;
        }

        return array[n - 1];
    }

    /**
     * findMaxIndex: Takes an array as argument and finds the last index at which
     * the minimum value of the array is.
     * 
     * @param array
     * @return An integer representing an index of the array.
     */
    public static int findMinIndex(int[] array) {
        int n = array.length;
        int min = findMin(array);
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] == min) {
                index = i;
            }
        }

        return index;
    }

    /**
     * isSortedAscend: Takes an array as argument and check whether is sorted in
     * ascending order or not.
     * 
     * @param array
     * @return A boolean value: 'true' if the array is sorted, 'false' if it's not.
     */
    public static boolean isSortedAscend(int[] array) {
        int n = array.length;
        int pivot = array[0];

        for (int i = 0; i < n; i++) {
            if (array[i] < pivot) {
                return false;
            }
            pivot = array[i];
        }

        return true;
    }

    /**
     * isSortedDescend: Takes an array as argument and check whether is sorted in
     * descending order or not.
     * 
     * @param array
     * @return A boolean value: 'true' if the array is sorted, 'false' if it's not.
     */
    public static boolean isSortedDescend(int[] array) {
        int n = array.length;
        int pivot = array[0];

        for (int i = 0; i < n; i++) {
            if (array[i] > pivot) {
                return false;
            }
            pivot = array[i];
        }

        return true;
    }

    /**
     * swapNeighbor: Takes an array as argument, goes through it swaping the values
     * if the element on the left is bigger than the element on the right.
     * 
     * @param array
     */
    public static void swapNeighbor(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                array[i + 1] += array[i];
                array[i] = array[i + 1] - array[i];
                array[i + 1] -= array[i];
            }
        }
    }

    /**
     * merge: Takes two arrays sorted in ascending order and merges them while
     * keeping the ascending order.
     * 
     * @param array1
     * @param array2
     * @return An array result of the merger of the two argument arrays.
     */
    public static int[] merge(int[] array1, int[] array2) {
        if (!isSortedAscend(array1) || !isSortedAscend(array2)) {
            JOptionPane.showMessageDialog(null, "Invalid arguments:\nBoth arrays must be sorted in ascending .",
                    "Error", JOptionPane.ERROR_MESSAGE);
            int[] errorArray = new int[0];
            return errorArray;
        }

        int n = array1.length;
        int m = array2.length;
        int l = n + m;
        int[] merged = new int[l];

        for (int i = 0, j = 0, k = 0; i < l; i++) {
            if (j < n && k < m) {
                if (array1[j] < array2[k]) {
                    merged[i] = array1[j];
                    j++;
                } else {
                    merged[i] = array2[k];
                    k++;
                }
            } else {
                if (j == n && k < m) {
                    merged[i] = array2[k];
                    k++;
                }
                if (k == m && j < n) {
                    merged[i] = array1[j];
                    j++;
                }
            }
        }

        return merged;
    }
}
