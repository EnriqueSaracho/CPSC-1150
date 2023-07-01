import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int card, num;
        String rank;
        System.out.print("card: ");
        card = input.nextInt();
        num = (card - 1) % 13 + 1;
        switch (num) {
            case 1:
                rank = "Ace";
                break;
            case 10:
                rank = "10";
                break;
            case 11:
                rank = "Jack";
                break;
            case 12:
                rank = "Queen";
                break;
            case 13:
                rank = "King";
                break;
            default:
                rank = Integer.toString(num);
        }
        System.out.println("rank: " + rank);
    }
}
