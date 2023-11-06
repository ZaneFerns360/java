abstract class GeometricShape {
    abstract double area();
    abstract double perimeter();
}

class Triangle extends GeometricShape {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Heron's formula
    double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    
    double perimeter() {
        return side1 + side2 + side3;
    }
}

class Square extends GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    
    double area() {
        return side * side;
    }

    
    double perimeter() {
        return 4 * side;
    }
}

class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Square square = new Square(4);

        System.out.println("Triangle - Area: " + triangle.area() + ", Perimeter: " + triangle.perimeter());
        System.out.println("Square - Area: " + square.area() + ", Perimeter: " + square.perimeter());
    }
}
