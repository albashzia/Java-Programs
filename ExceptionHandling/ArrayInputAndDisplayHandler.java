package ExceptionHandling;
import java.util.*;
public class ArrayInputAndDisplayHandler 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        boolean arrayFull = false;
        System.out.println("Enter Array Elements");
        while(!arrayFull)
        {
            for(int i = 0; i < array.length; i++)      
            {
                try
                {
                    array[i] = input.nextInt();
                }
                catch(InputMismatchException e1)
                {
                    System.out.println("Try again");
                    input.nextLine();
                    i--;
                }
            }
            arrayFull = true;
        }
        boolean elementDisplayed = false;
        while(!elementDisplayed)
        {
            try
            {
                System.out.print("Enter the index at which the element is to be displayed: ");
                int n = input.nextInt();
                System.out.println(array[n]);
                elementDisplayed = true;
            }
            catch(IndexOutOfBoundsException e2)
            {
                System.out.println("Invalid Index\nTry Again");
                input.nextLine();
            } 
        }
    }
}