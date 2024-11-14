package Abstraction;

abstract class Shape{
  abstract double area();
  void displayShapeType(){
    System.out.println("This is a Shape");
  }
}

class Circle extends Shape {
  double radius;

  public Circle(double radius){
    this.radius = radius;
  }

  @Override
  public double area(){
    return Math.PI * radius * radius;
  }
}

class Rectangle extends Shape {
  double length, breath;

  public Rectangle(double length, double breath){
    this.length = length;
    this.breath = breath;
  }

  @Override
  public double area(){
    return length * breath;
  }
}

public class abstraction {
  public static void main(String[] args) {
    Shape c = new Circle(5);
    Shape r = new Rectangle(4,5);

    c.displayShapeType();
    System.out.println(c.area());

    r.displayShapeType();
   System.out.println(r.area());
  }
}