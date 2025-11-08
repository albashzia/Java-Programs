import java.util.Scanner;
public class TemperatureDayAnalyzer 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature : ");
        double temperature = input.nextDouble();
        if (temperature > 35 )
        {
            System.out.println("Hot day");
        }
        else if (temperature >= 25)
        {
            System.out.println("Pleasant day");
        }
        else if (temperature <= 24 && temperature >= 18)
        {
            System.out.println("Cool day");
        }
        else if(temperature < 18)
        {
            System.out.println("Cold day");
        }

        input.close();
    }
}
