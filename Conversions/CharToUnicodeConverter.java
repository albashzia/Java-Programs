package Conversions;

import java.util.Scanner;
public class CharToUnicodeConverter
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter a character : ");
        ch = input.next().charAt(0);
        int num = (int)ch;
        System.out.println("The Unicode for the character "+ch+" is "+num);
        input.close();
    }
}
