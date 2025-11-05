import java.util.Scanner;
public class ThreeDigitsReverser 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three digit integer : ");
        int num = input.nextInt();
        int d1 = num/100;
        int d2 = (num/10)%10;
        int d3 = num%10;
        int reversed = (d3*100) + (d2*10) + (d1) ;
        int sum = num + reversed;
        System.out.println("The number entered is : "+num);
        System.out.println("The reversed number is : "+reversed);
        System.out.println("The sum is : "+sum);
        input.close();
    }
}