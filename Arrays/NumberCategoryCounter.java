import java.util.Scanner;
public class NumberCategoryCounter 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) 
        {
            numbers[i] = input.nextInt();
            if (numbers[i] > 0) 
            {
                positiveCount++;
            } 
            else if (numbers[i] < 0) 
            {
                negativeCount++;
            } 
            else 
            {
                zeroCount++;
            }
        }
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of zeros: " + zeroCount);
        input.close();
    }
}
