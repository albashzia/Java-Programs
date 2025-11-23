import java.util.Scanner;
public class MatrixMultiplication 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int r1,c1,r2,c2;
        System.out.print("Enter the number of rows for matrix 1 : ");
        r1 = input.nextInt();
        System.out.print("Enter the number of columns for matrix 1 : ");
        c1 = input.nextInt();
        System.out.print("Enter the number of rows for matrix 2 : ");
        r2 = input.nextInt();
        System.out.print("Enter the number of columns for matrix 2 : ");
        c2 = input.nextInt();
        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];
        int[][] result = new int[r1][c2];
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        if(c1 != r2)
        {
            System.out.println("Multiplication is not possible");
        }
        else
        {
            for(int i = 0; i < r1; i++)
            {
                for(int j = 0; j < c2; j++)
                {
                    result[i][j] = 0;
                    for(int k = 0; k < c1; k++)
                    {
                        result[i][j] = result[i][j]+matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
        }
        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c2; j++)
            {
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
        input.close();
    }
}
