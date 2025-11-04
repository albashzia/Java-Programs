import java.util.Scanner;
public class ISBNCalculator
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first 9 digits of an ISBN as an integer: ");
        int number = input.nextInt();
        int d1 = number/100000000;
        int d2 = (number/10000000)%10;
        int d3 = (number/1000000)%10;
        int d4 = (number/100000)%10;
        int d5 = (number/10000)%10;
        int d6 = (number/1000)%10;
        int d7 = (number/100)%10;
        int d8 = (number/10)%10;
        int d9 = (number)%10;
        int d10 = ((d1*1)+(d2*2)+(d3*3)+(d4*4)+(d5*5)+(d6*6)+(d7*7)+(d8*8)+(d9*9))%11;
        if(d10 == 10)
        {
            System.out.printf("%s%09d%c\n","The ISBN-10 number is ",number,'X');
        }
        else
        {
            System.out.printf("%s%09d%d\n","The ISBN-10 number is ",number,d10);
        }
        input.close();
    }
}