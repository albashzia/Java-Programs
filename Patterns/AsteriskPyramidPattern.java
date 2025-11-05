package Patterns;
import java.util.Scanner;
public class AsteriskPyramidPattern 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = input.nextInt();
        for(int i = 1; i <= n ; i++)
        {
            for(int j =1;j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        input.close();
    }
}