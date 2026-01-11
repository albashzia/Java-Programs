import java.util.Scanner;
public class MatrixColumnSumCalculator
{

    // function to calculate sum of a specific column in a matrix
    public static double sumColumn(double[][] m, int columnIndex) 
    {
        double sum = 0;
        for (int i = 0; i < m.length; i++) 
        {
            sum = sum + m[i][columnIndex];
        }
        return sum;
    }

    // main method to input matrix and column index, then display the sum
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();
        double[][] matrix = new double[rows][cols];
        System.out.println("\nEnter the matrix elements:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextDouble();
            }
        }
        System.out.print("\nEnter column index to sum (0 to " + (cols - 1) + "): ");
        int col = input.nextInt();
        if (col < 0 || col >= cols) {
            System.out.println("Invalid column index!");
        } 
        else 
        {
            double result = sumColumn(matrix, col);
            System.out.println("\nSum of column " + col + " = " + result);
        }
        input.close();
    }
}
