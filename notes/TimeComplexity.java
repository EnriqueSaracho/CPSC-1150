public class TimeComplexity {
    public static void main(String[] args) {
        int[] data = new int[] { 6, 7, 9, 12, 13, 23, 35, 40, 53, 74 };
        System.out.println(binarySearch(data, 23));
    }

    public static int LSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key) {
                start = mid + 1;
                mid = (start + end) / 2;
            } else {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }
        return -1;
    }
}
