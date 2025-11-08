import java.util.Scanner;
public class CheckDivisibleByFour 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        
        String result = (num%4==0)?"Divisible by 4":"Not divisible by 4";
        System.out.println(result);
    }
}
