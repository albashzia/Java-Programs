package ExceptionHandling;
import java.util.*;
class FactorialCalculator
{
    public static void main(String args[])
    {
        while(true) 
        {
            try 
            {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter an integer value ");
                int n = input.nextInt();
                System.out.println("Factorial = " + factorial(n));
                break;
            }
            catch(InputMismatchException ex) 
            {
                System.out.println("You have entered an invalid input");
                System.out.println("Try Again");
            }
        }
    }
    static int factorial(int n)
    {
        int f = 1;
        for(int i = 1; i <= n; i++)
        {
            f = f * i;
        }
        return f;
    }
}