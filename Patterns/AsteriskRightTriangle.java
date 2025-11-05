package Patterns;
import java.util.Scanner;
public class AsteriskRightTriangle
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = input.nextInt();
        for(int i = 1; i<=n; i++)
        {
            for(int j =1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        input.close();
    }
}
