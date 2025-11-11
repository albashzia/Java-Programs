package Arrays;
import java.util.Scanner;
public class FrequencyFinder 
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
        System.out.println("Enter the element to find its frequency: ");
        int target = input.nextInt();
        int frequency = 0;
        for (int i = 0; i < n; i++) 
        {
            if (numbers[i] == target) 
            {
                frequency++;
            }
        }
        System.out.println("Frequency of " + target + " in given array is : " + frequency);
        input.close();
    }
}
