import java.io.File;
import java.util.Scanner;

public class TextFile {
    public static void main(String[] args) throws Exception {
        File file = new File("../lab09/default_scores.txt");
        if (!file.canRead()) {
            System.out.println("Error: permission to read from file is denied");
            System.exit(1);
        }

        Scanner input = new Scanner(file); // throws FileNotFoundException

        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }
        input.close();
    }
}
