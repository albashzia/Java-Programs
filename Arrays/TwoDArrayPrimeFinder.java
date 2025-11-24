import java.util.Scanner;
class TwoDArrayPrimeFinder 
{
    public static void main(String args[]) 
    {
        Scanner input = new Scanner(System.in);
        int[][] array = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}, {20, 21, 22}};
        System.out.println("The given 2D array is. . . ");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("The prime numbers in 2D array are. .. ");
        int n = 0;
        for (int k = 0; k < 3; k++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                if (isPrime(array[k][j]) == true) 
                    {
                        System.out.println(array[k][j]);
                    }
            }
            n++;
        }
        System.out.println("Total Prime Numbers = " + n);
        input.close();
    }
public static boolean isPrime(int n) 
    {
        boolean prime = true;
        for (int i = 2; i < n / 2; i++) 
        {
            if (n % i == 0) 
            {
                prime = false;
                break;
                
            }
        }
        return prime;
    }
}