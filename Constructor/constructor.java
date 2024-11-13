package Constructor;

class Car{
  String color;
  String model;
  int year;
  int speed;

  Car(String color, String model, int year){
    this.color = color;
    this.model = model;
    this.year = year;
    this.speed = 20;
  }

  void start(){
    System.out.println("The " + color + " " + model + " is Starting");
  }

  void accelerate(){
    System.out.println("The " + color + " " + model + " is Accelerating at " + speed + "Km/Hr");
  }

  void stop(){
    System.out.println("The " + color + " " + model + " is Stopping");
  }
}

public class constructor{
  public static void main(String[] args) {
    Car c1 = new Car("Red", "Ferrari", 2024);
    c1.start();
    c1.accelerate();
    c1.stop();

    Car c2 = new Car("Blue", "Lambo", 2020);
    c2.start();
    c2.accelerate();
    c2.stop();
  }
}