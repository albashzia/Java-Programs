package Conditionals;
import java.util.Scanner;
import java.util.Random;
public class CorrectGuess 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        int randomNumber = rand.nextInt(2);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a guess number (0,1), 0 for Heads and 1 for Tails : ");
        int n = input.nextInt();
        if (n == 0 || n == 1 )
        {
            if(randomNumber == n)
            {
                System.out.println("Correct Guess");
            }
            else if(randomNumber != n)
            {
                System.out.println("Wrong Guess");
            }
        }
        else
        {
            System.out.println("Invalid Guess");
        }
        input.close();
    }
}