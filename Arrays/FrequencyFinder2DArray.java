public class FrequencyFinder2DArray {
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3, 4},
            {5, 1, 2, 1},
            {1, 6, 7, 8}
        };
        int target = 1;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == target) {
                    count++;
                }
            }
        }
        System.out.println("Frequency of " + target + " in given 2D array is : " + count);
    }
}
