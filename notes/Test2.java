import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        String userInput = getData();
        // int words = countWords(userText);

    }

    public static String getData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String userText = input.nextLine();
        input.close();
        return userText;
    }

    public static int countWords(String userText) {
        userText.trim();
        for (int i = 0; i < userText.length(); i++) {
            if ()
        }
    }
}
