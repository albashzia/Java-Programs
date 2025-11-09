import java.util.Scanner;
public class StringPalindromeChecker 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");

        input.close();
    }
}
