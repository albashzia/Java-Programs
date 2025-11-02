import java.util.Scanner;
public class SalesCommissionCalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int noOfItemsSold;
        int noOfSalespersons;
        System.out.println("Enter number of salespersons:");
        noOfSalespersons = input.nextInt(); 
        for (int i = 1; i <= noOfSalespersons; i++) 
        {
            double sum = 0;
            System.out.println("Enter number of items sold by salesperson " + i + ":");
            noOfItemsSold = input.nextInt();
            for (int j = 1; j <= noOfItemsSold; j++) 
            {
                System.out.println("Enter sale amount for item " + j + ":");
                double saleAmount = input.nextDouble();
                sum = sum + saleAmount;       
            }
            double commission = sum * 0.10;
            System.out.printf("Total = %.3f Commission = %.3f%n", sum, commission);
            System.out.println("-----------------------------------");
        }
        input.close();
    } 
}   