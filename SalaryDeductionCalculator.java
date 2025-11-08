import java.util.Scanner;
public class SalaryDeductionCalculator
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your salary : ");
        int salary = input.nextInt();
        
        double finalSalary;
        
        if( salary >= 30000)
        {
            finalSalary = salary - ((salary/100)*8);
        }
        
        else if (salary >= 15000 && salary < 30000)
        {
            finalSalary = salary - 1000;
        }
        
        else
        {
            finalSalary = salary;
        }
        
        System.out.println("The final salary is :"+finalSalary);
    }
}
