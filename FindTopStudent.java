import java.util.Scanner;
public class FindTopStudent 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        int maxScore = 0;
        String topStudent = "";
        for(int i=1;i<=num;i++)
        {
            System.out.print("Enter the name of the student no "+i+" : ");
            String name = input.next();
            System.out.print("Enter the score of this student : ");
            int score = input.nextInt();
            if(score>maxScore)
            {
                topStudent=name;
                maxScore= score;
            }
        }
        System.out.println("The name of top student is "+topStudent);
    }
}
