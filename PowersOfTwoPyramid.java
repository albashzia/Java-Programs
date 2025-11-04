import java.util.Scanner;

public class PowersOfTwoPyramid
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines (7 for the example) : ");
        int numLines = input.nextInt();
        System.out.println("Output for " + numLines + " lines:");
        for (int i = 0; i < numLines; i++) 
        {
            for (int space = 0; space < numLines - 1 - i; space++) 
            {
                System.out.print("    "); 
            }
            for (int j = 0; j <= i; j++) 
            {
                int value = (int) Math.pow(2, j);
                System.out.printf("%4d", value); 
            }
            for (int j = i - 1; j >= 0; j--) 
            {
                int value = (int) Math.pow(2, j);
                System.out.printf("%4d", value); 
            }
            System.out.println();
        }
        input.close();
    }
}