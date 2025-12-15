import java.io.*;
import java.util.*;
public class KeywordCounter {
    public static void main(String[] args) 
    {
        int count = 0;
        try 
        {
            File file = new File("book.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) 
            {
                String w = sc.next().toLowerCase();
                if (w.equals("java")) 
                {
                    count++;
                }
            }
            sc.close();
            System.out.println(count);
        } 
        catch (Exception e) 
        {
            System.out.println("Error");
        }
    }
}
