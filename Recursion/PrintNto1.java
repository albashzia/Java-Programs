package Recursion;
import java.util.Scanner;
public class PrintNto1 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = input.nextInt();
        printNum(n);
    }
    public static void printNum(int n) 
    {
        if(n==0)
            return;
        System.out.println(n);
        printNum(n-1);
    }
}
