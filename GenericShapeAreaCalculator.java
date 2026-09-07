abstract class Shape {
    public abstract double getArea();
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

public class GenericShapeAreaCalculator {

    public static <T extends Shape> double calculateArea(T shape){
        return shape.getArea();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        double rectangleArea = calculateArea(rectangle);
        double circleArea = calculateArea(circle);

        System.out.println(rectangleArea);
        System.out.println(circleArea);

    }
}
