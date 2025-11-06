package Loops;
import java.util.Scanner;
public class VowelCounter 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String s;
        int count = 0;
        System.out.print("Enter a string : ");
        s = input.nextLine();
        String str = s.toLowerCase();
        for(int i=0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            switch(ch)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count = count + 1;
                    break;
            }
        }
        System.out.println("The number of vowels in given string is "+count);
        input.close();
    }
}