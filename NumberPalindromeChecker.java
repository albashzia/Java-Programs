import java.util.Scanner;
public class NumberPalindromeChecker 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three digit integer : ");
        int num = input.nextInt();
        int first = num/100;
        int last = num%10;
        if (first == last)
            System.out.println(num+" is a palindrome");
        else
            System.out.println(num+" is not a palindrome");

        input.close();
    }
}
