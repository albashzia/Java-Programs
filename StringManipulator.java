import java.util.Scanner;
public class StringManipulator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        int choice = 0;
        while (choice != 5) 
        {
            System.out.println("\nEnter a choice from 1-5:");
            System.out.println("1. Count vowels");
            System.out.println("2. Count words");
            System.out.println("3. Convert to uppercase");
            System.out.println("4. Check palindrome");
            System.out.println("5. Exit");
            System.out.println(" ");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();
            switch (choice) 
            {
                case 1:
                    int count = 0;
                    for (int i = 0; i < str.length(); i++) 
                    {
                        char ch = Character.toLowerCase(str.charAt(i));
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                        {
                            count = count + 1;
                        }
                    }
                    System.out.println("Total vowels: " + count);
                    break;

                case 2:
                    String[] words = str.split(" ");
                    System.out.println("Total words: " + words.length);
                    break;

                case 3:
                    System.out.println("Uppercase string: " + str.toUpperCase());
                    break;

                case 4:
                    String reversed = "";
                    str = str.trim();
                    for (int i = str.length() - 1; i >= 0; i--) 
                    {
                        reversed = reversed + str.charAt(i);
                    }
                    if (str.equalsIgnoreCase(reversed))
                    {
                        System.out.println("The string is a palindrome.");
                    }
                    else
                    {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;

                case 5:
                    System.out.println("Program is exiting");
                    break;

                default:
                    System.out.println("Not a valid choice. Please enter 1–5.");
            }
        }
    }
}