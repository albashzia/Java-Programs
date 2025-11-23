import java.util.Scanner;  
public class RightShiftArray 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++)
        {
            numbers[i] = input.nextInt();
        }

        int lastElement = numbers[n - 1];

        for (int i = n - 1; i > 0; i--)
        {
        numbers[i] = numbers[i - 1];
        }

        numbers[0] = lastElement;

        System.out.println("Array after right circular shift:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(numbers[i] + " ");
        }
        input.close();
    }    
}
