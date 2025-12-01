import java.util.Scanner;
public class BinaryMatrixMaxFinder
{
    public static void main(String[] args) 
    {
        int n = 4; 
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
        System.out.println("Generated 4x4 Matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int maxRowIndex = 0;
        int maxRowCount = 0;

        for (int i = 0; i < n; i++) 
        {
            int count = 0;
            for (int j = 0; j < n; j++) 
            {
                if (matrix[i][j] == 1)
                    count++;
            }
            if (count > maxRowCount) 
            {
                maxRowCount = count;
                maxRowIndex = i;
            }
        }
        int maxColIndex = 0;
        int maxColCount = 0;
        for (int j = 0; j < n; j++) 
        {
            int count = 0;
            for (int i = 0; i < n; i++) 
            {
                if (matrix[i][j] == 1)
                    count++;
            }
            if (count > maxColCount) 
            {
                maxColCount = count;
                maxColIndex = j;
            }
        }
        System.out.println("\nThe largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
    }
}
