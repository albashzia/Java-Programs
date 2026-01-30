package Recursion;
import java.util.Scanner;
public class printXtoPowerN {
    public static int calcPower(int x, int n) 
    {
        if(x==0)
            return 0;
        if(n==0)
            return 1;
        return x*calcPower(x,n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,n;
        System.out.print("Enter the base: ");
        x = input.nextInt();
        System.out.println("Enter the power: ");
        n = input.nextInt();
        int result = calcPower(x,n);
        System.out.println(result);
    }
}
