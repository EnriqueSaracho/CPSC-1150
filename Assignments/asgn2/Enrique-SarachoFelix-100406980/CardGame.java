package asgn2;

import java.lang.Math;

/**
 * Program name: CardGame
 * Simulates picking a card from a 52 card deck.
 * 
 * @author Enrique Saracho Felix
 * @since June 10, 2023
 * 
 */
public class CardGame {
    /**
     * main: Generates a random integer between 0 and 51 and depending on the value
     * displays a card from the 52 card deck.
     * 
     */
    public static void main(String[] args) {
        int cardNum = (int) (Math.random() * 52); // Declare and assign value to cardNum.
        // Display card according to cardNum value.
        switch (cardNum) {
            case 0:
                System.out.println("The card has been picked is Ace of Hearts");
                break;
            case 1:
                System.out.println("The card has been picked is 2 of Hearts");
                break;
            case 2:
                System.out.println("The card has been picked is 3 of Hearts");
                break;
            case 3:
                System.out.println("The card has been picked is 4 of Hearts");
                break;
            case 4:
                System.out.println("The card has been picked is 5 of Hearts");
                break;
            case 5:
                System.out.println("The card has been picked is 6 of Hearts");
                break;
            case 6:
                System.out.println("The card has been picked is 7 of Hearts");
                break;
            case 7:
                System.out.println("The card has been picked is 8 of Hearts");
                break;
            case 8:
                System.out.println("The card has been picked is 9 of Hearts");
                break;
            case 9:
                System.out.println("The card has been picked is 10 of Hearts");
                break;
            case 10:
                System.out.println("The card has been picked is Jack of Hearts");
                break;
            case 11:
                System.out.println("The card has been picked is Queen of Hearts");
                break;
            case 12:
                System.out.println("The card has been picked is King of Hearts");
                break;
            case 13:
                System.out.println("The card has been picked is Ace of Diamonds");
                break;
            case 14:
                System.out.println("The card has been picked is 2 of Diamonds");
                break;
            case 15:
                System.out.println("The card has been picked is 3 of Diamonds");
                break;
            case 16:
                System.out.println("The card has been picked is 4 of Diamonds");
                break;
            case 17:
                System.out.println("The card has been picked is 5 of Diamonds");
                break;
            case 18:
                System.out.println("The card has been picked is 6 of Diamonds");
                break;
            case 19:
                System.out.println("The card has been picked is 7 of Diamonds");
                break;
            case 20:
                System.out.println("The card has been picked is 8 of Diamonds");
                break;
            case 21:
                System.out.println("The card has been picked is 9 of Diamonds");
                break;
            case 22:
                System.out.println("The card has been picked is 10 of Diamonds");
                break;
            case 23:
                System.out.println("The card has been picked is Jack of Diamonds");
                break;
            case 24:
                System.out.println("The card has been picked is Queen of Diamonds");
                break;
            case 25:
                System.out.println("The card has been picked is King of Diamonds");
                break;
            case 26:
                System.out.println("The card has been picked is Ace of Clubs");
                break;
            case 27:
                System.out.println("The card has been picked is 2 of Clubs");
                break;
            case 28:
                System.out.println("The card has been picked is 3 of Clubs");
                break;
            case 29:
                System.out.println("The card has been picked is 4 of Clubs");
                break;
            case 30:
                System.out.println("The card has been picked is 5 of Clubs");
                break;
            case 31:
                System.out.println("The card has been picked is 6 of Clubs");
                break;
            case 32:
                System.out.println("The card has been picked is 7 of Clubs");
                break;
            case 33:
                System.out.println("The card has been picked is 8 of Clubs");
                break;
            case 34:
                System.out.println("The card has been picked is 9 of Clubs");
                break;
            case 35:
                System.out.println("The card has been picked is 10 of Clubs");
                break;
            case 36:
                System.out.println("The card has been picked is Jack of Clubs");
                break;
            case 37:
                System.out.println("The card has been picked is Queen of Clubs");
                break;
            case 38:
                System.out.println("The card has been picked is King of Clubs");
                break;
            case 39:
                System.out.println("The card has been picked is Ace of Spades");
                break;
            case 40:
                System.out.println("The card has been picked is 2 of Spades");
                break;
            case 41:
                System.out.println("The card has been picked is 3 of Spades");
                break;
            case 42:
                System.out.println("The card has been picked is 4 of Spades");
                break;
            case 43:
                System.out.println("The card has been picked is 5 of Spades");
                break;
            case 44:
                System.out.println("The card has been picked is 6 of Spades");
                break;
            case 45:
                System.out.println("The card has been picked is 7 of Spades");
                break;
            case 46:
                System.out.println("The card has been picked is 8 of Spades");
                break;
            case 47:
                System.out.println("The card has been picked is 9 of Spades");
                break;
            case 48:
                System.out.println("The card has been picked is 10 of Spades");
                break;
            case 49:
                System.out.println("The card has been picked is Jack of Spades");
                break;
            case 50:
                System.out.println("The card has been picked is Queen of Spades");
                break;
            case 51:
                System.out.println("The card has been picked is King of Spades");
                break;
        }
    }
}
