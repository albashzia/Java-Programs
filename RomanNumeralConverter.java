import java.util.Scanner;
public class RomanNumeralConverter
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number in the range 1 - 10 : ");
        int number = input.nextInt();
        switch(number)
        {
            case 1:
                System.out.println("The roman numeral is I");
                break;
            case 2:
                System.out.println("The roman numeral is II");
                break;
            case 3:
                System.out.println("The roman numeral is III");
                break;
            case 4:
                System.out.println("The roman numeral is IV");
                break;
            case 5:
                System.out.println("The roman numeral is V");
                break;
            case 6:
                System.out.println("The roman numeral is VI");
                break;
            case 7:
                System.out.println("The roman numeral is VII");
                break;
            case 8:
                System.out.println("The roman numeral is VIII");
                break;
            case 9:
                System.out.println("The roman numeral is IX");
                break;
            case 10:
                System.out.println("The roman numeral is X");
                break;
            default:
                System.out.println("Invalid Input");
        }
        input.close();
    }
}
