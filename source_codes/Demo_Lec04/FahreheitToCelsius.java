
/** This program converts a temperature from 
 ** fahrenheit to Celsius
 */
import java.util.Scanner;

public class FahreheitToCelsius{
   public static void main(String[] args){
      double celsius, fahrentheit;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Please enter a fahrenheit temperatur: ");
      fahrentheit = scan.nextDouble();

      celsius = (5 / 9) * (fahrentheit -32);
      
      System.out.println(fahrentheit + " fahrenheit is " + celsius
                       + " celsius.");
	scan.close();
   }
}