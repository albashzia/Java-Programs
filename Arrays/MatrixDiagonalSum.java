import java.util.Scanner;
public class MatrixDiagonalSum 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[4][4];
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                matrix[i][j]=input.nextDouble();
            }
        }
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("The sum of elements of major diagonal is "+sumMajorDiagonal(matrix));
    }
    public static double sumMajorDiagonal(double[][] m) 
    {
        double sum = 0;
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if( i == j )
                {
                    sum = sum + m[i][j];
                }      
            }
        }
        return sum;
    }
}
