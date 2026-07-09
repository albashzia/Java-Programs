package Conditionals;

import java.util.Scanner;
public class RectangleAreaComparator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double lengthOne, lengthTwo, widthOne, widthTwo, areaOne, areaTwo;
        System.out.print("Enter the length of first rectangle : ");
        lengthOne = input.nextDouble();
        System.out.print("Enter the width of first rectangle : ");
        widthOne = input.nextDouble();
        areaOne = lengthOne*widthOne;
        
        System.out.print("Enter the length of second rectangle : ");
        lengthTwo = input.nextDouble();
        System.out.print("Enter the width of second rectangle : ");
        widthTwo = input.nextDouble();
        areaTwo = lengthTwo*widthTwo;
        
        System.out.println("The area of first rectangle is : "+areaOne);
        System.out.println("The area of second rectangle is : "+areaTwo);
        
        if ( areaOne > areaTwo)
        {
            System.out.println("First Rectangle has larger area");
        }
        else if ( areaTwo > areaOne)
        {
            System.out.println("Second Rectangle has larger area");
        }
        else
        {
            System.out.println("Both rectangles have equal area");
        }
        input.close();
    }
}
