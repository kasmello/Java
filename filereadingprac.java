import java.io.*;
import java.util.Scanner;

public class filereadingprac {
    public static void filereader(String fname) {
        try {
            File fileread = new File(fname + ".csv");
            Scanner scanread = new Scanner(fileread);
            while (scanread.hasNextLine()) {
                String data = scanread.nextLine();
                System.out.println(data);
            }
            scanread.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("oWo");
            e.printStackTrace();
        }
        
    }

    public static void filewriter(String fname) {
        try {
            FileWriter filewrite = new FileWriter(fname + ".csv", true);
            filewrite.write("\nA Possum");
            filewrite.close();
        } catch (FileNotFoundException e) {
            System.out.println("oWo");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("uWu");
            e.printStackTrace();
        }
        
        
    }

    public static void main(String[] args) {
        Scanner filein = new Scanner(System.in);
        String fname = filein.next();
        filereader(fname);
        filewriter(fname);
    }
    
    
}