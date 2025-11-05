package Patterns;
import java.util.Scanner;
public class AsteriskRectangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();
        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j<=columns;j++)
            {
                if( i==1 || i==rows || j==1 || j==columns )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        input.close();
    }
}
