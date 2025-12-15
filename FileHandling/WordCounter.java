import java.io.*;
import java.util.*;

public class WordCounter {

    public static void main(String[] args) {
        try 
        {
            PrintStream ps = new PrintStream("D:/Programming/Java/Programs/LabAssignment04/sample.txt");
            ps.println("Java is powerful and versatile");
            ps.println("File handling in Java is easy");
            ps.close();
            File file = new File("D:/Programming/Java/Programs/LabAssignment04/sample.txt");
            Scanner sc = new Scanner(file);
            int count = 0;
            while (sc.hasNext()) 
            {
                sc.next();
                count++;
            }
            sc.close();
            System.out.println("Total Words: " + count);
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File missing");
        }
    }
}
