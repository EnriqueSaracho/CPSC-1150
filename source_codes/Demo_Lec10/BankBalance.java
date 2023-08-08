import java.util.Scanner;

public class BankBalance{
    public static void main(String []args){
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter your current balance: ");
        double balance = input.nextDouble();
        final byte RATE = 5;
        final double TARGET = 2 * balance;
        int year = 0;
        while(balance < TARGET){
            year ++; 
            double interest = balance * RATE / 100;
            balance += interest;
        }
        System.out.printf("After %d years, your balance is %.2f.", year, balance);  
        input.close();
    }
}