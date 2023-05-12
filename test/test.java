/**
 ** Program Name: AccountTest
 ** 
 * @author Student's Name
 ** @since JDK 1.8
 **        Course: CPSC 1150
 **        Date: May 7th, 2017
 */
public class test {
    /**
     ** main: The main program which displays a student’s information and the course
     * information.
     **
     */
    public static void main(String[] args) {
        String name = "Jim Smith",
                logInName = "jsmith00",
                instructorName = "Bill Gates";
        int studentNumber = 100000000;
        showCourseInfo(instructorName); // display the course information
        System.out.println("My name is " + name + "."); // display the student’s name
        // display the student number and login name
        System.out.println("My student number is: " + studentNumber);
        System.out.println("My net work log in name is: " + logInName);
        System.out.println("\t*****End of Sample Code*****");
    }

    /**
     ** Displays the course information
     ** 
     * @param inputName a string stands for the instructor's name.
     ** @return 0 if every thing is fine, otherwise it returns 1.
     **
     **         precondition: inputName is declared in the calling function.
     **         postcondition: all the information will be displays on the screen.
     */
    public static int showCourseInfo(String inputName) {
        // display the course name and number.
        System.out.println("This course is CPSC 1150-003.");
        // display the instructor's name.
        System.out.println("The instructor is : " + inputName + ".");
        System.out.println("Have fun in this course.\n");
        return 0; // return to where this function is called (note for void function return is
                  // optional).
    }
}