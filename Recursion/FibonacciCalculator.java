package Recursion;

import java.util.Scanner;

public class FibonacciCalculator
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate factorial of it: ");
        int n = input.nextInt();
        int result = fib(n);
        System.out.println(result);
    }
    public static int fib(int n) 
    {
        if (n <= 1) 
        {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
