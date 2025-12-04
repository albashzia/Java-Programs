package Loops;
import java.util.Scanner;
public class VehiclePlateValidator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a vehicle plate number : ");
        String plate = input.nextLine();
        plate = plate.trim();
        int length = plate.length();
        if (length == 7) 
        {
            boolean valid = true;

            for (int i = 0; i < 3; i++) 
            {
                char ch = plate.charAt(i);
                if (ch < 'A' || ch > 'Z') 
                {
                    valid = false;
                    break;
                }
            }
            if (valid) 
            {
                for (int i = 3; i < 7; i++) 
                {
                    char ch = plate.charAt(i);
                    if (ch < '0' || ch > '9') 
                    {
                        valid = false;
                        break;
                    }
                }
            }
            if (valid)
                System.out.println("Correct Format");
            else
                System.out.println("Incorrect Format");
        } 
        else 
        {
            System.out.println("Incorrect Format");
        }
        input.close();
    }
}