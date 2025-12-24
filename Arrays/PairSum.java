public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int targetSum = 6;
        System.out.println("Pairs with sum " + targetSum + ":");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
}
