import java.util.Scanner;

public class AverageGrads{
    public static void main(String []args){
        Scanner input = new Scanner(System.in); 
        double sum = 0;
        int count = 0;
        String keepGoing;  
        do {
            System.out.print("Enter a garde : ");
            double grade = input.nextDouble(); //getting gardes
            count ++;                          //counting number of students
            sum += grade;                      //calculating the summation
            System.out.print("Is there more students?(y/n)"); //ask for countinuing 
            keepGoing = input.next();
        } while(keepGoing.charAt(0) == 'y');
        //calculating and printing the average 
        System.out.printf("The average grade is %.2f.", sum/count);  
        input.close();
    }
}