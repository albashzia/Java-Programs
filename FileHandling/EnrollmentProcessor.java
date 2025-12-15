import java.io.*;
import java.util.*;
public class EnrollmentProcessor 
{
    public static void main(String[] args) 
    {
        String path = "enrollment.txt";
        Scanner input = new Scanner(System.in);
        try 
        {
            PrintStream ps = new PrintStream(path);
            for (int i = 0; i < 5; i++) 
            {
                System.out.print("Enter StudentID, Name, Course, Status: ");
                String id = input.next();
                String name = input.next();
                String course = input.next();
                String status = input.next();
                ps.println(id + " " + name + " " + course + " " + status);
            }
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            int ecount = 0, dcount = 0;
            System.out.println("Programming Students:");
            while (scanner.hasNext()) 
            {
                String id = scanner.next();
                String name = scanner.next();
                String course = scanner.next();
                String status = scanner.next();
                if (status.equals("Enrolled")) {
                    ecount++;
                } 
                else 
                {
                    dcount++;
                }
                if (course.equals("Programming")) 
                {
                    System.out.println(name);
                }
            }
            System.out.println("Enrolled: " + ecount);
            System.out.println("Dropped: " + dcount);
        } 
        catch (Exception e) 
        {
            System.out.println("Error reading file");
        }
    }
}
