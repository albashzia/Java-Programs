import java.util.Scanner;
public class MatrixPrimeCountAnalyzer 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int matrix[][] = new int[3][4];

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter elements for row # "+(i+1)+" : ");
            for(int j = 0; j < 4; j++)
            {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("The original matrix is : ");
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }

        int maxRowPrimes = 0;
        int maxRowIndex = 0;

        for(int i = 0; i < 3; i++)
        {
            int primeCount = 0;
            for(int j = 0; j < 4; j++)
            {
                if(isPrime(matrix[i][j]))
                    primeCount++;
            }

            if(primeCount > maxRowPrimes)
            {
                maxRowPrimes = primeCount;
                maxRowIndex = i;
            }
        }

        int maxColPrimes = 0;
        int maxColIndex = 0;

        for(int j = 0; j < 4; j++)
        {
            int primeCount = 0;
            for(int i = 0; i < 3; i++)
            {
                if(isPrime(matrix[i][j]))
                    primeCount++;
            }

            if(primeCount > maxColPrimes)
            {
                maxColPrimes = primeCount;
                maxColIndex = j;
            }
        }

        System.out.println("\nRow with maximum prime numbers: " + (maxRowIndex + 1));
        System.out.println("Column with maximum prime numbers: " + (maxColIndex + 1));
    }

    public static boolean isPrime(int n) 
    {
        if(n < 2)
            return false;
        for(int i = 2; i <= n / 2; i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
