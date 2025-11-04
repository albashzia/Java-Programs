import java.util.Scanner;
public class PrimeNumberChecker 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int num = 0;
        boolean isPrime = false;
        while(!isPrime)
        {
            System.out.print("Enter a number : ");
            num = input.nextInt();
            isPrime = true;
            for (int i = 2; i < num; i++) 
            {
                if (num % i == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num > 1) 
            {
                System.out.println(num + " is a prime number.\nProgram stopped.");
            } 
            else 
            {
                System.out.println(num + " is not a prime number.\nTry again.");
            }
        }
        input.close();
    }
}
