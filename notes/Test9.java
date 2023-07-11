/*
 * Midterm 2 practice
 */
public class Test9 {
    public static void main(String[] args) {

    }

    /*
     * Program 8
     */
    public static int mode(int[] arr) {
        int n = arr.length;
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            if (count[i] == -1) {
                continue;
            } else {
                for (int j = 0; i < n; i++) {
                    if (arr[i] == arr[j]) {
                        count[i]++;
                        count[j] = -1;
                    }
                }
            }
        }
        int idx = findMaxIndex(count);
        return arr[idx];
    }

}
