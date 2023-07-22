import javax.swing.JOptionPane;

public class StudentScores {
    public static String activeScoresFile = "./default_scores.txt";

    public static void main(String[] args) {
        int option;
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog(null, String.format(
                    "Enter 1 to create a new course source file.\nEnter 2 to search into an existing course source file.\nEnter 3 to add more records to an existing course scores file.\nEnter 4 to quit the program.\n ")));
            switch (option) {
                case 1:
                    // createFile();
                    break;
                case 2:
                    // searchInFile();
                    break;
                case 3:
                    // addRecord();
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

    public static void createFile() {
        activeScoresFile = JOptionPane.showInputDialog(null, "Enter new file name:");

    }
}
