package Loops;
import java.util.Scanner;
public class MultiplicationTable 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int n = input.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            //System.out.println(n+" x "+i+" = "+(n*i));
            System.out.printf("%d x %2d = %2d\n",n,i,(n*i));
        }
        input.close();
    }
}