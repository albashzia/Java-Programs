package Arrays;
import java.util.Scanner;
public class UniqueElementsArrayMethod 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 elements for an array(Press Enter after each element)");
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextInt();
        }
        int[] uniqueNumbers = eliminateDuplicates(numbers);
        System.out.print("Unique Elements : ");
        for(int j = 0; j < uniqueNumbers.length; j++)
        {
            if(uniqueNumbers[j]!=0)
            {
                System.out.print(uniqueNumbers[j]+" ");
            }         
        }
        System.out.println(" ");
        input.close();
    }
    public static int[] eliminateDuplicates(int[] array)
    {
        int[] uniqueNumbers = new int[array.length];
        uniqueNumbers[0] = array[0];
        for(int i = 1; i < array.length; i++)
        {
            boolean isUnique = true;
            for(int j = 0; j < uniqueNumbers.length; j++)
            {
                if(array[i]==uniqueNumbers[j])
                {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique)
            {
                uniqueNumbers[i] = array[i];
            }
        }  
        return uniqueNumbers;
    }
}
