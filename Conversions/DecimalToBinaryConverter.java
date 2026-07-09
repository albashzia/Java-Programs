package Conversions;

import java.util.Scanner;
public class DecimalToBinaryConverter
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        int number = input.nextInt();
        String binary = ""; 
        if (number == 0) 
        {
            binary = "0";
        }
        else 
        {
            while (number > 0) 
            {
                int remainder = number % 2;    
                binary = remainder + binary;   
                number = number / 2;           
            }
        }
        System.out.println("Binary value: " + binary);
        input.close();
    }
}