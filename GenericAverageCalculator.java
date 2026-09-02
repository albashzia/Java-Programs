public class GenericAverageCalculator {
    public static <T extends Number> double calculateAverage(T[] array){
        double sum = 0;
        for (T number : array) {
            sum += number.doubleValue();
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Example usage with Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        double intAvg = calculateAverage(intArray);
        System.out.println("Average of Integer array: " + intAvg);

        // Example usage with Double array
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        double doubleAvg = calculateAverage(doubleArray);
        System.out.println("Average of Double array: " + doubleAvg);
    }
}
