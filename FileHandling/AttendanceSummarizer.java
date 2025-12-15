import java.io.*;
import java.util.*;
public class AttendanceSummarizer 
{
    public static void main(String[] args) 
    {
        String path = "D:/Programming/Java/Programs/LabAssignment04/attendance.txt";
        String sumPath = "D:/Programming/Java/Programs/LabAssignment04/attendance_summary.txt";
        Scanner input = new Scanner(System.in);
        try 
        {
            PrintStream ps = new PrintStream(path);
            for (int i = 0; i < 10; i++) 
            {
                System.out.print("Enter name : ");
                String name = input.next();
                System.out.print("Enter attendance status : ");
                String status = input.next();
                ps.println(name + " " + status);
            }
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            int p = 0, a = 0;
            while (scanner.hasNext()) 
            {
                scanner.next();
                String s = scanner.next();
                if (s.equals("P") || s.equals("p")) 
                {
                    p++;
                } 
                else 
                {
                    a++;
                }
            }
            PrintStream ps2 = new PrintStream(sumPath);
            ps2.println("Present: " + p);
            ps2.println("Absent: " + a);
        } 
        catch (Exception e) 
        {
            System.out.println("File error");
        }
    }
}
