import java.util.Scanner;
public class IncomeExpensePlanner 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter your pay rate per hour : ");
        double payRate = input.nextDouble();
        System.out.println("Enter the number of hours worked : ");
        double noOfHours = input.nextDouble();
        double incomeBeforeTaxes = payRate*noOfHours ;
        System.out.printf("Income before taxes = %.3f", incomeBeforeTaxes);
        System.out.println("");
        double tax = (incomeBeforeTaxes)*(0.14);
        System.out.printf("Tax on income = %.3f",tax);
        System.out.println("");
        double netIncome = incomeBeforeTaxes - tax;
        System.out.printf("Net Income = %.3f",netIncome);
        System.out.println("");
        double moneyClothes = netIncome*(0.1);
        System.out.printf("Money spent on clothes = %.3f",moneyClothes);
        System.out.println("");
        double moneySupplies = netIncome*(0.01);
        System.out.printf("Money spent on School Supplies = %.3f",moneySupplies);
        System.out.println("");
        double remMoney = netIncome - (moneyClothes+moneySupplies);
        System.out.printf("Remaining money = %.3f",remMoney);
        System.out.println("");
        double moneyBonds = remMoney*(0.25);
        System.out.printf("Money Spent on Saving Bonds = %.3f",moneyBonds);
        System.out.println("");
        double moneyParentsBonds = moneyBonds*(0.5);
        System.out.printf("Money spent by parents on additional saving bonds = %.3f",moneyParentsBonds);
        System.out.println("");
        input.close();
    }
}