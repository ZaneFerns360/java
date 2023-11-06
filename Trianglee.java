class Point{
  int x;
  int y;
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }
  public void display(){
    System.out.println("Point: (" + x + ", " + y + ")");
  }
}

class Line{
  Point a; 
  Point b;
  public Line(Point a, Point b){
    this.a = a;
    this.b = b;
  }
  public double length(){
    return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
  }
  public void display(){
    System.out.println("Line length: " + length());
  }
}

public class Trianglee{
  Line a;
  Line b;
  Line c;
  public Trianglee(Line a, Line b, Line c){
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public double perimeter(){
    return a.length() + b.length() + c.length();
  }
  public void display(){
    System.out.println("Triangle perimeter: " + perimeter());
  }
  public static void main(String[] args){
    Point P1 = new Point(0,0);
    Point P2 = new Point(0,1);
    Point P3 = new Point(1,0);
    Line L1 = new Line(P1,P2);
    Line L2 = new Line(P2,P3);
    Line L3 = new Line(P3,P1);
    Trianglee T1 = new Trianglee(L1, L2, L3);
    T1.display();
  }
}

