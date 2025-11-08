import java.util.Scanner;
public class ElectricityBillCalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the consumed units : ");
        double unitsConsumed = input.nextDouble();
        
        double cost = 0;
        
        if(unitsConsumed >= 0 && unitsConsumed <= 400)
        {
            cost = 3;
        }
        
        else if(unitsConsumed > 400 && unitsConsumed <=600)
        {
            cost = 5;
        }
        
        else if(unitsConsumed > 600)
        {
            cost = 8;
        }
        
        double totalBill = (unitsConsumed*cost)+200;
        System.out.println("The total bill with added line cost is : "+totalBill);
        input.close();
    }
}
