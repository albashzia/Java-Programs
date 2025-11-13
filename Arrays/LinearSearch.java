package Arrays;
import java.util.Scanner;
public class LinearSearch 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of expected elements in the array: ");
        int n = input.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the "+ n +" elements for the array:");
        for(int i = 0; i < array.length; i++)
        {
            array[i] = input.nextInt();
        }
        System.out.print("Enter number to find: ");
        int x = input.nextInt();
        boolean flag = false;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i]==x)
            {
                flag = true;
                break;
            }
        }
        if(flag== true)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not found");
        }
        input.close();
    }
}
