package Loops;
import java.util.Scanner;
public class SumOfSquares 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a postive integer n : ");
        int n = input.nextInt();
        int sum =0;
        for(int i = 1; i<=n;i++)
        {
            int sq = i*i;
            sum = sum + sq;
        }
        System.out.println("The sum of integers from 1 to "+n+" is "+sum);
        input.close();
    }
}