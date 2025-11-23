import java.util.Scanner;
public class PassFailCounter 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = input.nextInt();
        int[] scores = new int[n];
        System.out.println("Enter the scores of the students: ");
        for (int i = 0; i < n; i++) 
        {
            scores[i] = input.nextInt();
        }
        int passCount = 0;
        int failCount = 0;
        for (int i = 0; i < n; i++) 
        {
            if (scores[i] >= 50) 
            {
                passCount++;
            } 
            else 
            {
                failCount++;
            }
        }
        System.out.println("Number of students who passed: " + passCount);
        System.out.println("Number of students who failed: " + failCount);
        input.close();
    }
}
