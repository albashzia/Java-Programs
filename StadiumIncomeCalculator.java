import java.util.Scanner;
public class StadiumIncomeCalculator 
{
    public static void main(String[] args) 
    {
        final int A = 20;
        final int B = 15;
        final int C = 10;
        final int D = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of A class tickets sold : ");
        int soldTicketsA = input.nextInt();
        System.out.print("Enter the number of B class tickets sold : ");
        int soldTicketsB = input.nextInt();
        System.out.print("Enter the number of C class tickets sold : ");
        int soldTicketsC = input.nextInt();
        System.out.print("Enter the number of D class tickets sold : ");
        int soldTicketsD = input.nextInt();
        System.out.println("");
        int incomeA = A*soldTicketsA;
        int incomeB = B*soldTicketsB;
        int incomeC = C*soldTicketsC;
        int incomeD = D*soldTicketsD;
        System.out.println("The income generated from class A seats = "+incomeA);
        System.out.println("The income generated from class B seats = "+incomeB);
        System.out.println("The income generated from class C seats = "+incomeC);
        System.out.println("The income generated from class D seats = "+incomeD);
        int totalIncome = incomeA + incomeB + incomeC + incomeD;
        System.out.println("The total income generated is = "+totalIncome);
        input.close();
    }
}
