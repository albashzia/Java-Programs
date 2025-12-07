import java.io.*;
import java.util.*;
public class NumberFinder 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        try 
        {
            PrintStream ps = new PrintStream("D:/Programming/Java/Programs/LabAssignment04/number.txt");
            ps.println("5 8 12 20 25 30 7 9");
            ps.close();
            System.out.print("Enter number: ");
            int target = input.nextInt();
            File file = new File("D:/Programming/Java/Programs/LabAssignment04/number.txt");
            Scanner sc = new Scanner(file);
            boolean found = false;
            while (sc.hasNextInt()) 
            {
                if (sc.nextInt() == target) 
                {
                    found = true;
                }
            }
            sc.close();
            System.out.println(found ? "Found" : "Not Found");
        } 
        catch (Exception e) 
        {
            System.out.println("Error");
        }
    }
}
