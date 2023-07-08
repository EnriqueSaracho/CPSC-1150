import javax.swing.JOptionPane;

public class ArraysExercise {
    public static void main(String[] args) {
        // int[] array = getArray();
        // printArray(array);

        // JOptionPane.showMessageDialog(null, String.format("Maximum: %d",
        // findMax(array)));
        // JOptionPane.showMessageDialog(null, String.format("Minimum: %d",
        // findMin(array)));
        // JOptionPane.showMessageDialog(null,
        // String.format("First appearence of Maximum: index %d", findMaxIndex(array)));
        // JOptionPane.showMessageDialog(null,
        // String.format("Last appearence of Minimum: index %d", findMinIndex(array)));

        // JOptionPane.showMessageDialog(null,
        // String.format("Array sorted in ascending order: %b", isSortedAscend(array)));
        // JOptionPane.showMessageDialog(null,
        // String.format("Array sorted in descending order: %b",
        // isSortedDescend(array)));
        // swapNeightbor(array);
        // JOptionPane.showMessageDialog(null, "After swapNeighbor:");
        // printArray(array);

        int[] array2 = { 2, 6, 9 };
        int[] array1 = { -1, 5, 11, 12 };
        printArray(merge(array1, array2));
    }

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

    public static void printArray(int[] array) {
        int n = array.length;
        String elements = "";

        for (int i = 0; i < n; i++) {
            elements += String.format("%d : %-5d\n", i, array[i]);
        }

        JOptionPane.showMessageDialog(null, String.format("Array:\n%s", elements));
    }

    public static int findMax(int[] array) {
        int max = array[0];

        for (int i : array) {
            if (i > max)
                max = i;
        }

        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];

        for (int i : array) {
            if (i < min)
                min = i;
        }

        return min;
    }

    public static int findMaxIndex(int[] array) {
        int n = array.length;
        int max = findMax(array);

        for (int i = 0; i < n; i++) {
            if (array[i] == max)
                return i;
        }

        return array[n - 1];
    }

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

    public static void swapNeightbor(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                array[i + 1] += array[i];
                array[i] = array[i + 1] - array[i];
                array[i + 1] -= array[i];
            }
        }
    }

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
