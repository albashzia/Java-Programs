package Recursion;

public class FibonacciCalculator 
{
    public static void main(String[] args) 
    {
        int result = fib(5);
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
