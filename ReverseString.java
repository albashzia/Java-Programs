import java.util.Scanner;
public class ReverseString 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        System.out.print("Enter a string : ");
        s = input.nextLine();
        int length = s.length()-1;
        for(int i= length; i >= 0; i--)
        {
            System.out.print(s.charAt(i));
        }
        System.out.println("");
    }
}