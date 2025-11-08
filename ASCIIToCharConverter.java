import java.util.Scanner;
public class ASCIIToCharConverter 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code : ");
        int num = input.nextInt();
        if(num>=0 && num<=127)
        {
            char ch = (char)num;
            System.out.println("The character for ASCII code "+num+" is "+ch);
        }
        else
        {
            System.out.println("Invalid ASCII code.");
        }
    }
}
