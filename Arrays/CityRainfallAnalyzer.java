import java.util.Scanner;
public class CityRainfallAnalyzer
{
    public static void main(String[] args) 
    {
        String[] cities = new String[5];
        Scanner input = new Scanner(System.in);
        int[][] rainfall = new int[5][12];
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter the name of city: ");
            cities[i] = input.next();
            System.out.println("Enter the rainfall of this city over 12 months: ");
            for(int j = 0; j < 12; j++)
            {
                rainfall[i][j] = input.nextInt();
            }
        }
        String highestRainfallCity = "";
        int highestRainfall = 0;
        for(int i = 0; i < 5; i++)
        {
            int totalRainfall = 0;
            for(int j = 0; j < 12; j++)
            {
                totalRainfall = totalRainfall + rainfall[i][j];
            }
            System.out.println("The total yearly rainfall for "+cities[i]+" is: "+totalRainfall);
            if(totalRainfall>highestRainfall)
            {
                highestRainfall = totalRainfall;
                highestRainfallCity = cities[i];
            }
        }
        System.out.println("The city with highest rainfall is "+highestRainfallCity);
    }
}
