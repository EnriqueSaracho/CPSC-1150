package notes;

// import java.lang.Math;

public class Week5 {
    public static void main(String[] args) {
        // double random = Math.random() * (77 - -93) + -93;
        // System.out.println(random);

        int x;
        x = (int) (Math.random() * 999 + 1);
        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
