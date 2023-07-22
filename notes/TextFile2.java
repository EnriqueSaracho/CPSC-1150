import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class TextFile2 {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter the file name: ");
        Scanner sc = new Scanner(System.in);
        String filename = sc.next();
        sc.close();

        File file = new File(filename);
        if (!file.canRead()) {
            System.out.println("Error: permission to read from file is denied");
            System.exit(1); // or return
        }

        Scanner input = new Scanner(file); // throws FileNotFoundException

        int count = 0;
        while (input.hasNext()) {
            String token = input.next();
            if (isWord(token))
                count++;
        }
        input.close();
        System.out.println(count);
    }

    public static boolean isWord(String w) {
        for (int i = 0; i < w.length(); i++) {
            char ch = w.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                return true;
        }
        return false;
    }
}
