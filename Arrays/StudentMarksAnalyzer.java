import java.util.Scanner;
public class StudentMarksAnalyzer 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[][] data = new int[10][6];
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Enter roll number for student " + (i+1) + ":");
            data[i][0] = input.nextInt();   
            System.out.println("Enter 5 subject marks for this student:");
            for (int j = 1; j < 6; j++) {
                data[i][j] = input.nextInt();    
            }
        }
        int highestTotal = 0;
        int rollHighestTotal = 0;
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 1; j < 6; j++) 
            {
                sum = sum + data[i][j];
            }
            if (sum > highestTotal) 
            {
                highestTotal = sum;
                rollHighestTotal = data[i][0];
            }
        }
        int highestPF = 0;
        int rollHighestPF = 0;

        for (int i = 0; i < 10; i++) {
            if (data[i][1] > highestPF) {
                highestPF = data[i][1];
                rollHighestPF = data[i][0];
            }
        }
        System.out.println("\nHighest marks of each student:");
        for (int i = 0; i < 10; i++) 
        {
            int max = data[i][1]; 
            for (int j = 2; j < 6; j++) 
            {
                if (data[i][j] > max) 
                {
                    max = data[i][j];
                }
            }
            System.out.println("Roll No " + data[i][0] + " , Highest marks = " + max);
        }
        System.out.println("\nStudent with highest total marks: Roll No " + rollHighestTotal);
        System.out.println("Student with highest PF marks: Roll No " + rollHighestPF);
    }
}
