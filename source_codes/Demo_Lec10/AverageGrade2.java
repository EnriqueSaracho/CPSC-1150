import java.util.Scanner;

public class AverageGrade2{
    public static void main(String []args){
        Scanner input = new Scanner(System.in); 
        double sum = 0;
        int count = 0;
        String keepGoing;  
        do {
            System.out.print("Outer loop- Enter a garde : "); //prompting user
            double grade = input.nextDouble(); //catch data
            while (grade < 0 || 100 < grade){  //validiating the data
               System.out.print("Inner loop- Error in data\n" +
                             "Enter a number between 0 and 100 : "); 
               grade = input.nextDouble();     //catch data again
            } 
            count ++;                          //counting number of students
            sum += grade;                      //calculating the summation
            System.out.print("Outer loop- Is there more students?(y/n)"); //ask for countinuing 
            keepGoing = input.next();
        } while(keepGoing.charAt(0) == 'y');
        //calculating and printing the average 
        System.out.printf("The average grade is %.2f.", sum/count);  
        input.close();
    }
}