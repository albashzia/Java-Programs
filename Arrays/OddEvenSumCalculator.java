import java.util.Scanner;
public class OddEvenSumCalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        int oddSum = 0;
        int evenSum = 0;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) 
        {
            numbers[i] = input.nextInt();
            if (numbers[i] % 2 == 0) 
            {
                evenSum += numbers[i];
            } 
            else 
            {
                oddSum += numbers[i];
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        input.close();
    }
}
