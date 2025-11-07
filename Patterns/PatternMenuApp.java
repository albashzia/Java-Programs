package Patterns;
import java.util.Scanner;
public class PatternMenuApp
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        char again;
        do {
            System.out.println("Choose a pattern (1 - 5): ");
            int choice = input.nextInt();
            switch (choice) 
            {
                case 1: 
                    for (int i = 1; i <= 4; i++) 
                    {
                        for (int j = 1; j <= 10; j++) 
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) 
                    {
                        for (int j = 1; j <= i; j++) 
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 5; i++) 
                    {
                        for (int s = i; s < 5; s++) 
                            System.out.print(" ");
                        for (int j = 1; j <= i; j++) 
                            System.out.print("*");
                        System.out.println();
                    }
                    break;
                case 4: 
                    for (int i = 1; i <= 5; i++) 
                    {
                        for (int s = i; s < 5; s++) 
                        {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) 
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 5: 
                    for (int i = 1; i <= 5; i++) 
                    {
                        for (int s = i; s < 5; s++) 
                        {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) 
                        {
                            System.out.print(i);
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.print("Do you want to print another pattern? (y/n): ");
            again = input.next().charAt(0);
        } while (again == 'y' || again == 'Y');
    }
}
