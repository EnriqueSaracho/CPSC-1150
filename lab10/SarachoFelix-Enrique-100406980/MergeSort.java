/**
 * Program name: MergeSort
 * Implements the merge sort algorithm.
 * 
 * @author Enrique Saracho Felix
 * @since July 29, 2023
 * 
 */
public class MergeSort {
    /**
     * main: Creates an array of size 20, prints it, sorts it, then prints it again.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] list1 = genArray(20);
        printArray("The array before merge sort: ", list1);
        mergeSort(list1);
        printArray("The array After merge sort", list1);
    }

    /**
     * mergeSort: Recursively divides an array in two until the parts are of one
     * item each, then in recursive reverse merges them in ascending order.
     * 
     * @param list array.
     */
    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            int mid = list.length / 2;

            int[] firstHalf = new int[mid];
            copyArray(list, firstHalf, 0, mid);
            mergeSort(firstHalf);

            int[] secondHalf = new int[list.length - mid];
            copyArray(list, secondHalf, mid, list.length);
            mergeSort(secondHalf);

            merge(firstHalf, secondHalf, list);
        }
    }

    /**
     * genArray: generates an array of the size specified in the argument.
     * 
     * @param size integer.
     * @return an array of random integers of size 'size'.
     */
    public static int[] genArray(int size) {
        int[] list = new int[size];
        for (int i = 0; i < size; ++i)
            list[i] = (int) (Math.random() * 100);
        return list;
    }

    /**
     * printArray: prints an array next to a given header.
     * 
     * @param header string.
     * @param arr    array.
     */
    public static void printArray(String header, int[] arr) {
        System.out.println(header);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /**
     * copyArray: copies from index start to index end the elements of array
     * sourceLs, into array destLs.
     * 
     * @param sourceLs array of integers.
     * @param destLs   array of integers.
     * @param start    integer.
     * @param end      integer.
     */
    public static void copyArray(int[] sourceLs, int[] destLs, int start, int end) {
        for (int i = start; i < end; i++)
            destLs[i - start] = sourceLs[i];
    }

    /**
     * merge: merges firstHalf and secondHalft elements into list in ascending
     * order.
     * 
     * @param firstHalf  array of integers.
     * @param secondHalf array of integers.
     * @param list       array of integers.
     */
    public static void merge(int[] firstHalf, int[] secondHalf, int[] list) {
        int i = 0;
        int j = 0;
        int k = 0;
        for (; i < list.length; i++) {
            if (j == firstHalf.length) {
                list[i] = secondHalf[k];
                k++;
                continue;
            }
            if (k == secondHalf.length) {
                list[i] = firstHalf[j];
                j++;
                continue;
            }
            if (firstHalf[j] < secondHalf[k]) {
                list[i] = firstHalf[j];
                j++;
            } else {
                list[i] = secondHalf[k];
                k++;
            }
        }
    }
}
