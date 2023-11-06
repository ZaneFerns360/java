abstract class GeometricShape {
    abstract double area();
    abstract double perimeter();
}

class Triangle extends GeometricShape {
    private double base;
    private double height;
    private double side1;
    private double side2;

    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    @Override
    double perimeter() {
        return base + side1 + side2;
    }
}

class Square extends GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}

public class Geometry {
    public static void main(String[] args) {
        GeometricShape triangle = new Triangle(3, 4, 3, 4);
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        GeometricShape square = new Square(5);
        System.out.println("Square area: " + square.area());
        System.out.println("Square perimeter: " + square.perimeter());
    }
}

