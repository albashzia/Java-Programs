import java.util.Scanner;
public class SumOfCubes 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number till which the sum of cubes is to be calculated : ");
        int N = input.nextInt();
        int sum = 0;
        for(int i = 1; i<= N; i++)
        {
            int c = i*i*i;
            sum = sum+c;
        }
        System.out.println("The sum of cubes from 1 to "+N+" is "+sum);
        input.close();
    }
}
