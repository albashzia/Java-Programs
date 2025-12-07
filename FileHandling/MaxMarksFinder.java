import java.io.*;
import java.util.*;
public class MaxMarksFinder 
{
    public static void main(String[] args) 
    {
        try 
        {
            File file = new File("D:\\Programming\\Java\\Programs\\FileHandling\\students.txt");
            Scanner input = new Scanner(file);
            int max = 0;

            while (input.hasNext()) 
            {
                int rno = input.nextInt();
                input.nextLine();
                String name = input.nextLine();
                int marks = input.nextInt();

                if (marks > max) 
                {
                    max = marks;
                }
            }
            input.close();

          
            System.out.println("Students having maximum marks (" + max + "):");
            input = new Scanner(file);
            while (input.hasNext())
            {
                int rno = input.nextInt();
                String name = input.next();
                int marks = input.nextInt();

                if (marks == max) 
                {
                    System.out.println(name);
                }
            }
            input.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e.toString());
        }
    }
}
