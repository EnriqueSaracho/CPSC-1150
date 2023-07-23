import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFilePracice {
    public static void main(String[] args) throws Exception {
        File inputFile = new File("./StudentScores.txt");
        if (inputFile.exists()) {
            System.out.println("File found...");
        }

        if (inputFile.isDirectory()) {
            System.out.println("File object is a directory");
        }
        if (inputFile.isFile()) {
            System.out.println("File object is a file");
        }

        System.out.println("file name: " + inputFile.getName());
        System.out.println("parent object: " + inputFile.getParent());
        System.out.println("file path: " + inputFile.getPath());
        System.out.println("last modified: " + inputFile.lastModified());
        System.out.println("length: " + inputFile.length());

        if (!inputFile.canRead()) {
            System.out.println("Error: permission to read from file denied");
            System.exit(1);
        }

        Scanner input = new Scanner(inputFile); // Throws FileNotFoundException

        String firstName = input.next();
        String lastName = input.next();
        int score = Integer.parseInt(input.next());
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Score: " + score);

        String nextPerson = input.next() + " " + input.next() + " " + input.next();
        System.out.println("Next person is: " + nextPerson);

        input.close();

        File outputFile = new File("./new_file.txt");
        PrintWriter output = new PrintWriter(outputFile);
        output.println("Hello World");

        File newFile = new File("new_file.txt");
        if (newFile.exists()) {
            System.out.println("File already exists");
        } else {
            if (newFile.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.print("Error: failed to create file");
            }
        }
    }
}
