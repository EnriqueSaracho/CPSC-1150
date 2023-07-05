import java.util.Scanner;

public class Test6 {
    public static void main(String[] agrs) {
        final int N = 10;
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter " + N + " numbers: ");

        int[] data = new int[N];

        for (int i = 0; i < N; i++) {
            data[i] = (int) (Math.random() * 101);
        }
        int max = data[0];

        System.out.println();

        for (int i : data) {
            System.out.println(i);
            if (i > max) {
                max = i;
            }
        }

        int[] shuffle = new int[N];
        for (int i = 0; i < N; i++) {
            int random = (int) (Math.random() * 10);
            shuffle[i] = data[random];
        }

        System.out.println();
        System.out.println(max);

        // System.out.print(data);

        input.close();
    }

}
