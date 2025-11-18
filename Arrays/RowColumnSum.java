package Arrays;

public class RowColumnSum 
{
    public static void main(String[] args) 
    {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i = 0; i < matrix.length; i++) 
        {
            int rowSum = 0;
            int colSum = 0;
            for(int j = 0; j < matrix[i].length; j++) 
            {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            System.out.println("Sum of row " + (i+1) + ": " + rowSum);
            System.out.println("Sum of column " + (i+1) + ": " + colSum);
        }
    }
}
