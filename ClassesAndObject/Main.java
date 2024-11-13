package ClassesAndObject;

class Car {
  String color;
  String model;
  int year;
  int speed;

  void Start(){
    System.out.println("The " + color + " " + model + " is Starting!!");
  }

  void Stop(){
    System.out.println("The " + color + " " + model + " is Stopping!!");
  }

  void Accelerate(){
    System.out.println("The " + color + " " + model + " is Speeding!!");
  }
}

public class Main{
  public static void main(String[] args) {
    Car c1 = new Car();
    c1.color = "Red";
    c1.model = "Lambo";
    c1.year = 2024;

    c1.Start();
    c1.Accelerate();
    c1.Stop();

    Car c2 = new Car();
    c2.color = "Blue";
    c2.model = "Ferarri";
    c2.year = 2020;

    c2.Start();
    c2.Accelerate();
    c2.Stop();
  }
}