import java.util.*;
public class RectangleCalculator 
{
    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        int length;
        int width;
        int area; 
        int perimeter;
        System.out.print("Enter the length: ");
        length = console.nextInt();
        System.out.println();
        System.out.print("Enter the width: ");
        width = console.nextInt();
        System.out.println();
        area = length * width;
        perimeter = 2 * (length + width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        console.close();
    }
}