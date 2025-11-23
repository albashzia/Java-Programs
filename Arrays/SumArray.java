import java.util.Scanner;
public class SumArray 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < 5; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("The sum of array elements is "+sum(arr));
        input.close();
    }
    static int sum(int[] arr)
    {
        int sum = 0;
        for(int x:arr)
        {
            sum +=x;
        }
        return sum;
    }
}
