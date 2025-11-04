import java.util.Scanner;
public class DeskRequirementCalculator
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int a,b,c, desks;
        System.out.print("Enter the number of Students in class 1 : ");
        a = input.nextInt();
        System.out.print("Enter the number of Students in class 2 : ");
        b = input.nextInt();
        System.out.print("Enter the number of Students in class 3 : ");
        c = input.nextInt();
        int desksA = (a/2)+(a%2);
        int desksB = (b/2)+(b%2);
        int desksC = (c/2)+(c%2);
        desks = desksA + desksB + desksC ;
        System.out.println("The total number of desks to be bought is "+desks);
        input.close();
    }
}