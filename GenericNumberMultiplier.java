public class GenericNumberMultiplier {
    public static <T extends Number> double multiply(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static void main(String[] args) {
        Integer num1 = 5;
        Double num2 = 3.5;

        double result = multiply(num1, num2);
        System.out.println("Multiplication Result: " + result);
    }
}
