import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class TextFile2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input file name: ");
        String inFileName = sc.next();

        System.out.print("Enter the output file name: ");
        String outFileName = sc.next();
        sc.close();

        File inFile = new File(inFileName);
        if (!inFile.canRead()) {
            System.out.println("Error: permission to read from file is denied");
            System.exit(1); // or return
        }

        Scanner input = new Scanner(inFile); // Throws FileNotFoundException

        File outFile = new File(outFileName);
        PrintWriter pw = new PrintWriter(outFile);

        int counter = 0;
        while (input.hasNext()) {
            String token = input.next();
            if (isWord(token)) {
                counter++;
                pw.println(token);
            }
        }
        input.close();
        System.out.println(counter);
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
