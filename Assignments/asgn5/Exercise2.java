public class Exercise2 {
    public static void main(String[] args) {
        // int[] list = { 5, 2, 9, 3, 6, 8 };
        int[] list = { 7, 2, 10, 14, 8, 3, 2, 26, 31, 6, 5, 9 };
        System.out.println(partition(list));
    }

    /**
     * partition: finds where the pivot (first element of the array) would be placed
     * if the array was rearranged so that all elements before it were smaller and
     * all elements after it were larger.
     * 
     * @param list array of integers.
     * @return the index of the pivot after the rearrangement.
     */
    public static int partition(int[] list) {
        int pivot = list[0];
        int i = 1;
        int j = list.length - 1;
        while (i < j) {
            if (list[i] <= pivot)
                i++;
            if (list[j] >= pivot)
                j--;
            if (list[i] > pivot && list[j] < pivot) {
                i++;
                j--;
            }
        }
        return j;
    }
}
