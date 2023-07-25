import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Program name: StudentScores.java
 * Keeps track of student records by giving the user three options, to create a
 * new file, search in the active file, and add more records.
 * 
 * @author Enrique Saracho Felix
 * @since July 23, 2023
 * 
 */
public class StudentScores {
    public static File activeFile = new File("./default_scores.txt");

    /**
     * main: includes program logic, displays options available and calls methods
     * accordingly.
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null, String.format(
                    "Enter 1 to create a new course source file.\nEnter 2 to search into an existing course source file.\nEnter 3 to add more records to an existing course scores file.\nEnter 4 to quit the program.\n ")));
            switch (option) {
                case 1:
                    createFile();
                    break;
                case 2:
                    searchInFile();
                    break;
                case 3:
                    addRecord();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Exiting program");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input: select one of the four options.", "Error",
                            JOptionPane.ERROR_MESSAGE);
            }
        } while (option != 4);
    }

    /**
     * createFile: creates and makes active a new file.
     * 
     * @throws Exception
     */
    public static void createFile() throws Exception {
        boolean flag = false;
        do {
            String newName = JOptionPane.showInputDialog(null, "Enter new file name: ");
            activeFile = new File(newName);
            if (activeFile.exists()) {
                JOptionPane.showMessageDialog(null, "File already exists.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                if (activeFile.createNewFile()) {
                    JOptionPane.showMessageDialog(null, "File created successfully.");
                    flag = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to create file.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } while (!flag);

    }

    /**
     * searchInFile: Searches for students in the active file which have a
     * user-entered key in their name.
     * 
     * @throws Exception
     */
    public static void searchInFile() throws Exception {
        String key = JOptionPane.showInputDialog(null, "Search: ");

        if (!activeFile.canRead()) {
            JOptionPane.showMessageDialog(null, "Permission to read from file " + activeFile.getName() + " denied",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

        Scanner input = new Scanner(activeFile);
        String result = "";
        String student = "";
        while (input.hasNext()) {
            String token = input.next();
            if (isName(token)) {
                student += token + " ";
            }
            if (isScore(token)) {
                student += token;
                if (hasKey(student, key)) {
                    result += student + "\n";
                }
                student = "";
            }
        }
        input.close();

        JOptionPane.showMessageDialog(null, String.format("Search results:\n%s",
                result));
    }

    /**
     * isName: Checks if the token is a name.
     * 
     * @param token
     * @return 'true' if it's a name, 'false' if it's not.
     */
    public static boolean isName(String token) {
        for (int i = 0; i < token.length(); i++) {
            char ch = token.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                return true;
        }
        return false;
    }

    /**
     * isScore: Checks if the token is a score.
     * 
     * @param token
     * @return 'true' if it's a score, 'false' if it's not.
     */
    public static boolean isScore(String token) {
        if (Character.isDigit(token.charAt(0)))
            return true;
        return false;
    }

    /**
     * hasKey: Checks if a user-entered key is inside a name;
     * 
     * @param student
     * @param key
     * @return
     */
    public static boolean hasKey(String student, String key) {
        String studentLower = student.toLowerCase();
        String keyLower = key.toLowerCase();

        return studentLower.contains(keyLower);
    }

    /**
     * addRecord: adds a new student record to the active file.
     * 
     * @throws Exception
     */
    public static void addRecord() throws Exception {
        String name, score;

        name = JOptionPane.showInputDialog(null, "Enter student name:");
        score = JOptionPane.showInputDialog(null, "Enter student score:");

        FileWriter fileWriter = new FileWriter(activeFile, true);
        PrintWriter output = new PrintWriter(fileWriter);
        output.println(name + " " + score);
        output.close();
    }
}
