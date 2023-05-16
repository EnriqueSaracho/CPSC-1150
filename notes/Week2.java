package notes;

public class Week2 {
    public static void main(String[] args) {
        // Constant variables:
        /*
         * final int NUMERO_DIEZ = 10;
         * // NUMERO_DIEZ = 11; // Can't reassing value to constant variable.
         * System.out.println(NUMERO_DIEZ);
         */

        // Overflow:
        /*
         * byte num = 120;
         * num = num + 10;
         * System.out.println(num);
         * 
         * Posible solution:
         * num = (byte)(num + 10)
         * But it's still a lossy convertion and some data will be lost.
         */

        // You can add a byte type to an integer.
        /*
         * byte num1 = 120;
         * int num2 = num1 + 30;
         * System.out.println(num2);
         */

        // Roundoff Error (not precise):
        /*
         * System.out.println("1.0 - 0.9 = " + (1.0 - 0.9));
         */

        int num1;
        int num2, num3;
        num1 = 1;
        float num4 = 5.7f;
        int num5 = 5, num6 = 6;
        int r = 10;
        int d = r;
        int p = d;
        int num7 = (int) num4;
        final double TAX_RATE = 0.12;
    }
}
