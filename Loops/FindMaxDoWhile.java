package Loops;
import java.util.Scanner; 
public class FindMaxDoWhile
{ 
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 
        int number, max; 
        System.out.println("Enter the numbers, enter 0 to exit. ");
        number = input.nextInt();  
        max = number;
        do 
        { 
        number = input.nextInt(); 
        if (number > max) 
        max = number; 
        }while (number != 0); 
        System.out.println("max is " + max+" and number " + number); 

        input.close();
    } 
}
