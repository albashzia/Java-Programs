package Loops;
import java.util.Scanner;
public class SSNValidator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN : ");
        String ssn = input.nextLine();
        ssn = ssn.trim();
        int length = ssn.length();
        if (length == 11) 
        {
            if (ssn.charAt(3) == '-' && ssn.charAt(6) == '-') {
                boolean valid = true;

                for (int i = 0; i < 11; i++) 
                {
                    if (i == 3 || i == 6)
                        continue; 

                    char ch = ssn.charAt(i);
                    if (ch < '0' || ch > '9') 
                    {
                        valid = false;
                        break;
                    }
                }

                if (valid)
                    System.out.println(ssn+" is a valid social security number.");
                else
                    System.out.println(ssn+" is an invalid social security number.");
            } 
            else 
            {
                System.out.println(ssn+" is an invalid social security number.");
            }
        } 
        else 
        {
            System.out.println(ssn+" is an invalid social security number.");
        }
        input.close();
    }
}