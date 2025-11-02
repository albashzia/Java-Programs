import java.util.Scanner;
public class VariableAndCalculationDemo 
{
   static Scanner console = new Scanner(System.in);
    public static void main(String[] args) 
    {
        final int SECRET = 11;
        final double RATE = 12.50;
        int num1,num2,newNum;
        String name;
        double hoursWorked,wages;
        System.out.print("Enter First number: ");
        num1 = console.nextInt();
        System.out.print("Enter Second number: ");
        num2 = console.nextInt();
        System.out.println("The value of num1 = "+num1+ " and the value of num2 = "+num2);
        newNum = num1*2+num2;
        System.out.println("The value of newNum is "+newNum);
        newNum = newNum + SECRET;
        System.out.println("The value of newNum after adding SECRET is = "+newNum);
        System.out.print("Enter your last name: ");
        name = console.next();
        System.out.print("Enter number of hours worked (0 - 70): ");
        hoursWorked = console.nextDouble();
        wages = hoursWorked*RATE;
        System.out.println("Name : "+name);
        System.out.println("Pay Rate : $"+RATE);
        System.out.println("Hours Worked : "+hoursWorked);
        System.out.println("Salary : "+wages);
    }
}