import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class TextFilePractice2 {
    public static void main(String[] args) throws Exception {
        String[] filenames = getFileNames();
        String[] data = getData(filenames[0]);
        Arrays.sort(data);
        writeData(data, filenames[1]);
        System.out.println(filenames[1] + " is created");
    }

    public static String[] getData(String infilename) throws Exception {
        File file = new File(infilename);
        if (!file.canRead()) {
            System.out.println("Error: permission to read from file is denied");
            System.exit(1);
        }

        Scanner input = new Scanner(file);
        final int SIZE = 100;
        String[] data = new String[SIZE];
        int i = 0;
        while (input.hasNext())
            data[i++] = input.next();
        input.close();
        String[] result = clean(data, i);
        return result;
    }

    public static String[] getFileNames() {
        String[] names = new String[2];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of input file: ");
        names[0] = sc.next();
        System.out.print("Enter the name of output file: ");
        names[1] = sc.next();

        sc.close();
        return names;
    }

    public static String[] clean(String[] data, int size) {
        return Arrays.copyOf(data, size);
    }

    public static void writeData(String[] data, String outfilename) throws Exception {
        PrintWriter writer = new PrintWriter(outfilename);
        for (String s : data)
            writer.println(s);
        writer.close();
    }
}
