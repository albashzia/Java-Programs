import java.util.Scanner;
import  static java.lang.Math.*;
public class CurrencyChangeCounter
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of dollars: ");
        double amount = input.nextDouble();
        double cents = amount*100;
        double dollars = floor(cents/100);
        double remainingCents = cents%100;
        double quarter = floor(remainingCents/25);
        remainingCents = remainingCents%25;
        double dimes = floor(remainingCents/10);
        remainingCents = remainingCents%10;
        double nickels = floor(remainingCents/5);
        remainingCents = remainingCents%5;
        double pennies = remainingCents;
        System.out.println("Total Cents : "+cents);
        System.out.println("Dollars : "+dollars);
        System.out.println("Quarters : "+quarter);
        System.out.println("Dimes : "+dimes);
        System.out.println("Nickels : "+nickels);
        System.out.println("Pennies : "+pennies);
        input.close();
    }
}
