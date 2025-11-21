import java.util.Scanner;
public class ArraySortCheckerMethod 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements to be inserted in the array: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++)
        {
            numbers[i] = input.nextInt();
        }
        if (isSorted(numbers)==true)
        {
            System.out.println("Sorted");
            for(int j = 0; j < n; j++)
            {
                System.out.print(numbers[j]+" ");
            }
            System.out.println();
        }
        else
            if(isSorted(numbers)==false)
            {
                System.out.println("Not sorted");
                System.out.println("The sorted array is");
                for (int i = 0; i < n-1; i++) 
                {
                    for (int j = i+1; j < n; j++) 
                    {
                        if (numbers[j] < numbers[i]) 
                        {
                            int temp = numbers[i];
                            numbers[i] = numbers[j];
                            numbers[j] = temp;
                        }
                    }   
                }
                for(int j = 0; j < n; j++)
                {
                    System.out.print(numbers[j] + " ");
                }
            System.out.println();
            }
        input.close();
    }
    
    public static boolean isSorted(int[] list)
    {
        boolean sorted = true;
        for(int i = 0; i < list.length-1; i++)
        {
            if(list[i]>list[i+1])
            {
                sorted = false;
            }
        }
        return sorted;
    }
}
