import static java.lang.Math.ceil;
import java.util.Scanner;
public class MilkProductionReporter 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double milkProduced;
        int numberOfCartons;
        final double COST = 0.38;
        final double PROFIT = 0.27;
        System.out.print("Please enter the number for litres of milk produced : ");
        milkProduced = input.nextDouble();
        numberOfCartons = (int)(ceil(milkProduced/3.78));
        System.out.println("No. of cartons : "+numberOfCartons);
        double costOfProduction = COST*milkProduced;
        System.out.println("Cost of productions : "+costOfProduction);
        double profit = PROFIT*numberOfCartons;
        System.out.println("Profit Generated : "+profit);
        input.close();
    }
}