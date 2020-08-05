import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        try {
            Scanner myInput = new Scanner(System.in);
            String filename = myInput.next();
            File myObj = new File(filename + ".csv");
            Scanner myReader = new Scanner(myObj);
            String[] Array = new String[7000];
            Integer i = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                Array[i] = data;
                i += 1;
            }
            
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error oWo");
            e.printStackTrace();
        }
    }
    
}