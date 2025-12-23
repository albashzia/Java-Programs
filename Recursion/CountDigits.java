package Recursion;

public class CountDigits {
    public static int CountDigits(int n)
    {
        if(n>=0 && n<=9)
            return 1;
        return 1 + CountDigits(n/10);
    }
    public static void main(String[] args) {
        int n = 12345;
        int result = CountDigits(n);
        System.out.println("Number of digits in " + n + " is: " + result);
    }
}
