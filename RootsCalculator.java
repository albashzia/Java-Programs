import java.util.Scanner;
public class RootsCalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three integers a, b and c ; ");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        double x = (b*b)-(4*a*c);
        double disc = Math.pow(x,0.5);
        if (disc > 0)
        {
            double x1 = (-b + disc)/(2*a);
            double x2 = (-b - disc)/(2*a);
            System.out.printf("%s%8.5f%s%8.5f\n","The equation has two roots ",x1," and ",x2);
        }
        else if (disc == 0)
        {
            double x3 = (-b)/(2*a);
            System.out.printf("%s%5.3f\n","The quation has one root ",x3);
        }
        else
        {
            System.out.println("This equation has no real roots.");
        } 
        input.close();
    }
}