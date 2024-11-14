package Interfaces;

interface Drivable{
  void drive();
}

interface Flyable{
  void fly();
}

interface Swimmable{
  void swim();
}

class UnknownVehicle implements Drivable, Flyable {
  @Override
  public void drive(){
    System.out.println("Unknown Vehicle is Driving");
  }

  @Override
  public void fly() {
    System.out.println("Unknown Vehicle is Flying");
  }
}

class AmbigiousVechicle implements Flyable, Swimmable {
  @Override
  public void fly(){
    System.out.println("Ambigious Vechicle is Flying");
  }

  @Override
  public void swim(){
    System.out.println("Ambigious Vehicle is Swimming");
  }
}

public class interfac{
  public static void main(String[] args) {
    UnknownVehicle uv = new UnknownVehicle();
    uv.drive();
    uv.fly();

    AmbigiousVechicle av = new AmbigiousVechicle();
    av.fly();
    av.swim();
  }
}