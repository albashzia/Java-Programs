package Recursion;

public class Print2DArray {
    public static void print2DArray(int[][] arr, int row, int col) {
        if (row == arr.length) {
            return;
        }
        if (col == arr[row].length) {
            System.out.println();
            print2DArray(arr, row + 1, 0);
            return;
        }
        System.out.print(arr[row][col] + " ");
        print2DArray(arr, row, col + 1);
    }

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("2D Array elements:");
        print2DArray(array, 0, 0);
    }
}
