package Recursion;

public class PrintFibonacciSeries {
    public static void main(String[] args) 
    {
        int a = 0;
        int b = 1;
        int n = 7;
        System.out.println(a);
        System.out.println(b);
        printFibSeries(a,b,n-2);
    }
    public static void printFibSeries(int a, int b, int n) 
    {
        if(n==0)
            return;
        int c = a + b;
        System.out.println(c);
        printFibSeries(b,c,n-1);
    }
}
