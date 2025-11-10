package Arrays;
import java.util.Scanner;
public class StudentMarksArray 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = input.nextInt();
        String[] studentNames = new String[n];
        int[] studentMarks = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = input.next();
            System.out.print("Enter marks of " + studentNames[i] + ": ");
            studentMarks[i] = input.nextInt();
            sum += studentMarks[i];
        }   
        System.out.println();
        double average = sum / n;
        System.out.println("Average marks of the class: " + average);
        System.out.println();
        System.out.println("Students scoring above average:");
        for (int i = 0; i < n; i++) 
        {
            if (studentMarks[i] > average) 
            {
                System.out.println(studentNames[i] + " with marks: " + studentMarks[i]);  
            }
        }
        input.close();
    }
}