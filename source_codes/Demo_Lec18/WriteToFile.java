import java.io.PrintWriter;
import java.io.File;

public class WriteToFile{
    public static void main(String[] args) throws Exception{
        File file = new File("out.txt");

        if(file.exists() && !file.canWrite()){
            System.out.println("File already exists and permission to write is denied!");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file); //throws FileNotFoundException
        output.print("John T Simth ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85); 
        
        output.close();
    }
  
} 