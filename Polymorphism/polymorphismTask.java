package Polymorphism;

class Vehicle{
  public void move(){
    System.out.println("Vehicle is Moving!");
  }
}

class Car extends Vehicle {
  @Override
  public void move(){
    System.out.println("Car is Moving!");
  }
}

class Bicycle extends Vehicle {
  @Override
  public void move(){
    System.out.println("Bicycle is Moving");
  }
}

class Person {
  public void eat(){
    System.out.println("Eating...");
  }

  public void eat(int quantity){
    System.out.println("Person is eating Quantity");
  }
}

class polymorphismTask {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.eat();
    p1.eat(100);

    Bicycle b1 = new Bicycle();
    Car c1 = new Car();

    b1.move();
    c1.move();
  }
}