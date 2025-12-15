package ExceptionHandling;
import java.util.*;
public class SafeIntegerAddition 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int a,b;
        boolean validInput = false;
        while(!validInput)
        {   
            //try block to check for invalid inputs
            try
            {
                System.out.print("Enter 1st value: ");
                a = input.nextInt();
                System.out.print("Enter 2nd value: ");
                b = input.nextInt();
                System.out.println("The sum is "+(a+b));
                validInput = true;
            }
            //catch block to handle invalid inputs
            catch(InputMismatchException e1)
            {
                System.out.println("You have entered an invalid input, type integers only");
                input.nextLine();
            }
        }
        input.close();
    }
}