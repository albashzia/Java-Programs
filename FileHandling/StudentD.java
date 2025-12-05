import java.io.*;
import java.util.*;
public class StudentDataWriter
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        try
        {
            File file = new File("D:\\Programming\\Java\\Programs\\FileHandling\\students.txt");
            PrintStream ps = new PrintStream(file);
            while(true)
            {
                System.out.print("Enter roll no : ");
                int rollNo = input.nextInt();
                if(rollNo == 0)
                    break;
                System.out.print("Enter your name : ");
                String name = input.nextLine();
                System.out.print("Enter your marks: ");
                int marks = input.nextInt();
                ps.println(rollNo);
                ps.println(name);
                ps.println(marks);
            }
            System.out.println("File created successfully");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}