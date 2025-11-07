package Loops;
import java.util.Scanner;
public class CountEvenNumbers
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter numbers to count even numbers from them. Enter 0 to exit.");
        while (true) 
        {
            int num = input.nextInt();
            if (num == 0) 
                break;
            if (num % 2 == 0) 
                count++;
        }
        System.out.println("The number of even numbers is "+count);
    }
}
