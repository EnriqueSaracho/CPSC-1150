import java.util.Scanner;
import java.io.File;

public class ReadFromFile{
    public static void main(String[] args)throws Exception {
        File file = new File("scores2.txt");
        if (!file.canRead()){ 
            System.out.println("Error: permission to read from file is denied"); 
            System.exit(1); //or return;
        }   
        
        Scanner input = new Scanner(file); //throws FileNotFoundException

        while(input.hasNext()){
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }
        input.close();
    }  
} 