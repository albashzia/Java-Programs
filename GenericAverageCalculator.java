public class GenericAverageCalculator {
    public static <T extends Number> double calculateAverage(T[] array){
        double sum = 0;
        for (T number : array) {
            sum += number.doubleValue();
        }
        return sum / array.length;
    }

}
