import java.io.*;
import java.util.*;

public class RecordFilter 
{
    public static void main(String[] args) 
    {
        try
        {   
            File original = new File("D:\\Programming\\Java\\Programs\\FileHandling\\students.txt");
            File temp = new File("D:\\Programming\\Java\\Programs\\FileHandling\\temp.txt");

            Scanner input = new Scanner(original);
            PrintStream ps = new PrintStream(temp); 

            while(input.hasNext())
            {
                int rno = input.nextInt();
                input.nextLine();                
                String name = input.nextLine(); 
                int marks = input.nextInt();

                if(marks >= 50)
                {
                    ps.println(rno);
                    ps.println(name);
                    ps.println(marks);
                }             
            }

            original.delete();
            temp.renameTo(original);

            System.out.println("File Update Successful");
            input.close();
            ps.close();
        }
        catch(Exception e )
        {
            System.out.println(e.toString());
        }
    }
}
