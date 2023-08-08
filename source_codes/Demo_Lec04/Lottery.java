import java.util.Scanner;

public class Lottery{
     public static void main(String[] args){
         int winningNumber;
         double ticket_price;
         Scanner input = new Scanner(System.in);
         
         System.out.println("\nPlease enter the Lottery number:");
         winningNumber = input.nextInt();

         System.out.print("\nPlease enter the ticket_price: ");
         ticket_price = input.nextDouble();    
     
         System.out.println("The winning number is: " + winningNumber +
                             "\nThe ticket price is: " + ticket_price);        
   }
}