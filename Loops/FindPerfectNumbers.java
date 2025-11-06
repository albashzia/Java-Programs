package Loops;
public class FindPerfectNumbers 
{
    public static void main(String[] args) 
    {
        System.out.println("Perfect numbers less than 10,000 are:");
        for (int n = 1; n < 10000; n++) {
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) 
            {
                if (n % i == 0) 
                {
                    sum = sum + i;
                }
            }
            if (sum == n) 
            {
                System.out.println(n);
            }
        }
    }
}