class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

class Line {
    Point point1;
    Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double getLength() {
        int x1 = point1.x;
        int y1 = point1.y;
        int x2 = point2.x;
        int y2 = point2.y;

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public void displayLength() {
        System.out.println("Line Length: " + getLength());
    }
}

class Triangle {
    Line line1;
    Line line2;
    Line line3;

    public Triangle(Line line1, Line line2, Line line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    public double getPerimeter() {
        return line1.getLength() + line2.getLength() + line3.getLength();
    }

    public void displayPerimeter() {
        System.out.println("Triangle Perimeter: " + getPerimeter());
    }
}

class Main {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(7,1);
        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point2, point3);
        Line line3 = new Line(point3, point1);

        point1.display();
        point2.display();
        point3.display();

        line1.displayLength();
        line2.displayLength();
        line3.displayLength();

        Triangle triangle = new Triangle(line1, line2, line3);
        triangle.displayPerimeter();
    }
}
