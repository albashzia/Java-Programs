package Patterns;
import java.util.Scanner;   
public class AsteriskStarPattern 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines ( Enter odd number for accurate pattern ) : ");
        int n = input.nextInt();
        int mid = (n + 1) / 2;
        for(int i = 1; i<=n;i++)
        {
            for(int j = 1; j<=n;j++)
            {
                if(i==mid || j==mid || i+j==n+1 || i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}
