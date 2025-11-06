import java.util.Scanner;
public class CalculateNSum
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers to calculate sum : ");
        int N = input.nextInt();
        int sum = 0;
        System.out.println("Enter the numbers one by one : ");
        for(int i = 0; i < N; i++)
        {
            int n = input.nextInt();
            sum = sum+n;
        }
        System.out.println("The sum is : "+sum);
        input.close();
    }
}
