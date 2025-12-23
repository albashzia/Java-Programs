package Recursion;

public class SumDigits {
    public static int SumDigits(int n)
    {
        if(n>=0 && n<=9)
            return n;
        return (n % 10) + SumDigits(n / 10);
    }
    public static void main(String[] args) {
        int n = 12345;
        int result = SumDigits(n);
        System.out.println("Sum of digits in " + n + " is: " + result);
    }
}
