interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Triangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class Draw {
    public static void main(String[] args) {
        Drawable rectangle = new Rectangle();
        rectangle.draw();  // Outputs: Drawing a rectangle

        Drawable circle = new Circle();
        circle.draw();  // Outputs: Drawing a circle

        Drawable triangle = new Triangle();
        triangle.draw();  // Outputs: Drawing a triangle
    }
}

