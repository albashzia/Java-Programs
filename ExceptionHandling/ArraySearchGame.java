package ExceptionHandling;
import java.util.*;
class ArraySearchGame
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int array[] = {11, 5, 8, 3, 21, 7, 66, 33, 31, 90};
        int choice = 1;
        while(choice == 1)
        {
            try
            {
                System.out.print("Enter an integer value to search in array: ");
                int n = input.nextInt();
                System.out.print("Enter the index of the array: ");
                int index = input.nextInt();
                if(array[index] == n)
                    System.out.println("You Won!");
                else
                    System.out.println("You Lost");
                System.out.print("Do you want to continue... (Press 1 for YES and 0 for NO)");
                choice = input.nextInt();
                if(choice == 0)
                    break;
            }
            catch(InputMismatchException ex)
            {
                System.out.println("You have entered an invalid input type");
                System.out.println("Try Again");
                input.nextLine();
            }
            catch(ArrayIndexOutOfBoundsException ex2)
            {
                System.out.println("You have entered an invalid index");
                System.out.println("Try Again");
                input.nextLine();
            }
        }
    }
}