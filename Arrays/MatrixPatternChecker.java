import java.util.Scanner;

public class MatrixPatternChecker 
{
    public static void main(String[] args) 
  {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        boolean rowFound = false;
        for (int i = 0; i < n; i++) 
        {
            boolean allZero = true;
            boolean allOne  = true;
            for (int j = 0; j < n; j++) 
            {
                if (matrix[i][j] == 1) 
                    allZero = false;
                if (matrix[i][j] == 0) 
                    allOne = false;
            }
            if (allZero) 
            {
                System.out.println("All 0s on row " + i);
                rowFound = true;
            }
            if (allOne) 
            {
                System.out.println("All 1s on row " + i);
                rowFound = true;
            }
        }
        if (!rowFound) 
            System.out.println("No row with same numbers");
        boolean colFound = false;
        for (int j = 0; j < n; j++) 
        {
            boolean allZero = true;
            boolean allOne = true;
            for (int i = 0; i < n; i++) 
            {
                if (matrix[i][j] == 1) allZero = false;
                if (matrix[i][j] == 0) allOne = false;
            }
            if (allZero) {
                System.out.println("All 0s on column " + j);
                colFound = true;
            }
            if (allOne) {
                System.out.println("All 1s on column " + j);
                colFound = true;
            }
        }
        if (!colFound) System.out.println("No column with same numbers");
        boolean majorSame = true;
        for (int i = 1; i < n; i++) 
        {
            if (matrix[i][i] != matrix[0][0]) 
            {
                majorSame = false;
                break;
            }
        }
        if (majorSame)
            System.out.println("Same numbers on major diagonal");
        else
            System.out.println("No same numbers on major diagonal");
        boolean subSame = true;
        for (int i = 1; i < n; i++) 
        {
            if (matrix[i][n - 1 - i] != matrix[0][n - 1]) 
            {
                subSame = false;
                break;
            }
        }
        if (subSame)
            System.out.println("Same numbers on sub-diagonal");
        else
            System.out.println("No same numbers on sub-diagonal");
    }
}
