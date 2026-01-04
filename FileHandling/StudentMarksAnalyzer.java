import java.io.File;
import java.util.Scanner;
public class StudentMarksAnalyzer 
{
    public static void main(String[] args) 
    {
        int count = 0;
        try
        {
            File file = new File("D:\\Programming\\Java\\Programs\\FileHandling\\students.txt");
            Scanner input = new Scanner(file);
            while(input.hasNext())
            {
                int rno = input.nextInt();
                String name = input.next();
                int marks = input.nextInt();
                if(marks > 50)
                {
                    count++;
                }
            }
            System.out.println("The number of students with marks greater than 50 in file "+file.getName()+" are "+count);
            input.close();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
