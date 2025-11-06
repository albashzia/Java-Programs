import java.util.Scanner;
public class CalculateFactorial 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please a number to calculate its factorial : ");
        int n = input.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++)
        {
            fact = fact*i;
            
        }
        System.out.println("The factorial of "+n+" is "+fact);
    }
}
