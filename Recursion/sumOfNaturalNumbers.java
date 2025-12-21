package Recursion;
public class sumOfNaturalNumbers {
    public static void main(String[] args) {
        printSum(1,5,0);
    }
    public static void printSum(int i, int n, int sum) 
    {
        if(i==n)
        {
            sum = sum + n;
            System.out.println("The sum is "+sum);
            return;
        }
        sum = sum + i;
        printSum(i+1,n,sum);
    }
}
