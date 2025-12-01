package ExceptionHandling;
import java.util.Scanner;
public class SimpleConsoleCalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int a,b,choice = 0;
        do
        {
            System.out.print("Enter 1st value: ");
            a = input.nextInt();
            System.out.print("Enter 2nd value: ");
            b = input.nextInt();
            System.out.print("\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Quit\nEnter your choice: ");
            choice = input.nextInt();
            try
            {
                switch(choice)
                {
                    case 1:
                        System.out.println("The sum is "+(a+b));
                        break;
                    case 2:
                        System.out.println("The difference is "+(a-b));
                        break; 
                    case 3:
                        System.out.println("The product is "+(a*b));
                        break;
                    case 4:
                        System.out.println("The quotient is "+(a/b));
                        break;
                    case 5: 
                        break;
                    default:
                        System.out.print("Invalid Choice");
                }
            }
            catch(ArithmeticException e1)
            {
                System.out.println("It is divided by 0 exception");
                System.out.println("Try Again");
            }
        }
        while(choice!=5);

        input.close();
    }
}