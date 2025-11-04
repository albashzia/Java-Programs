import java.util.Scanner;
public class DigitSumCalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number between 0 - 999 : ");
        int num = input.nextInt();
        int num1 = num/100;
        int rem = num%100;
        int num2 = rem/10;        
        int num3 = num%10;
        int numf = num1 + num2 + num3;
        System.out.println(numf);
        input.close();
    }
}