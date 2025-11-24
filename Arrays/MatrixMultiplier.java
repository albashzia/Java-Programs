import java.util.Scanner;
public class MatrixMultiplier
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int[][] matrix1 = new int[3][4];
        int[][] matrix2 = new int[4][3];
        int[][] result = new int[3][3];
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    result[i][j] = 0;
                    for(int k = 0; k < 4; k++)
                    {
                        result[i][j] = result[i][j]+matrix1[i][k]*matrix2[k][j];
                    }
                }
            }
        System.out.println("Result of Matrix Multiplication:");
        for (int l = 0; l < 3; l++) 
        {
            for (int m = 0; m < 3; m++)
            {
                System.out.print(result[l][m] + "  ");
            }
            System.out.println();
        }
        input.close();
    }
}
