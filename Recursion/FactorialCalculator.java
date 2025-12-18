package Recursion;
public class FactorialCalculator 
{
    public static void main(String[] args) 
    {
        System.out.println(fact(5));
    }
    public static int fact(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n * fact(n-1);
    }
    
}
