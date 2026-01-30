package Recursion;
import java.util.Scanner;
public class PalindromeChecker {
    public static boolean isPalindrome(String str)
    {
        if(str.length() <= 1)
            return true;
        if(str.charAt(0) != str.charAt(str.length() - 1))
            return false;
        return isPalindrome(str.substring(1, str.length() - 1));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string/word to check if it is a palindrome: ");
        String str = input.next();
        boolean result = isPalindrome(str);
        if(result)
            System.out.println("\"" + str + "\" is a palindrome.");     
        else
            System.out.println("\"" + str + "\" is not a palindrome.");
    }
}   
