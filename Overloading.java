public class Overloading {
    // Method to calculate the area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public double area(double base, double height, String shape) {
        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        } else {
            // Default case for unknown shape
            return -1;
        }
    }

    public static void main(String[] args) {
        Overloading calculator = new Overloading();

        double circleArea = calculator.area(5.0);
        System.out.println("Area of the circle: " + circleArea);

        double rectangleArea = calculator.area(4.0, 6.0);
        System.out.println("Area of the rectangle: " + rectangleArea);

        double triangleArea = calculator.area(3.0, 4.0, "triangle");
        System.out.println("Area of the triangle: " + triangleArea);
    }
}
