package Recursion;

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
        String str = "racecar";
        boolean result = isPalindrome(str);
        if(result)
            System.out.println("\"" + str + "\" is a palindrome.");     
        else
            System.out.println("\"" + str + "\" is not a palindrome.");
    }
}   
