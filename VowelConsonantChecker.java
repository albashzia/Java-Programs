import java.util.Scanner;
public class VowelConsonantChecker
{
        public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); // creating a scanner object
        System.out.print("Enter a single alphabet character: ");
        char ch = input.next().charAt(0); // taking input from the user

        ch = Character.toLowerCase(ch); // converting input to lower case 

        if (ch < 'a' || ch > 'z') 
        {
            System.out.println("Error: Not a valid alphabet letter.");
        } 
        else 
        {
            switch (ch) 
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
                    break;
            }
        }
        input.close(); // closing scanner object
    }
}
