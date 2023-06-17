public class Specials {
    public static void main(String[] args) {
        for (int i = 11, j = 0; i < 1000; i++) {
            if (i / 100 + i % 10 == (i / 10) % 10) {
                System.out.printf("%3d ", i);
                j++;
            }
            if (j > 6) {
                System.out.printf("%n");
                j = 0;
            }
        }
    }
}
