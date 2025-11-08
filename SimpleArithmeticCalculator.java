import java.util.Scanner;
public class SimpleArithmeticCalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double a = input.nextInt();
        System.out.print("Enter second number : ");
        double b = input.nextInt();
        System.out.print("Enter the operator for required operation (+,-,*,/): ");
        String op = input.next();
        switch(op)
        {
            case "+":
                System.out.println("The result of addition is "+(a+b));
                break;
            case "-":
                System.out.println("The result of subtraction is "+(a-b));
                break;
            case "*":
                System.out.println("The result of multiplication is "+(a*b));
                break;
            case "/":
                System.out.println("The result of division is "+(a/b));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }        
        input.close();
    }
}
