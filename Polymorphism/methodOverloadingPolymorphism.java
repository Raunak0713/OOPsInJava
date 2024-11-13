package Polymorphism;

class methodOverloading{
  public int add(int a, int b){
    return a + b;
  }

  public double add(double a, double b){
    return a + b;
  }
}

public class methodOverloadingPolymorphism{
  public static void main(String[] args) {
    methodOverloading m1 = new methodOverloading();

    System.out.println(m1.add(3, 7));
    System.out.println(m1.add(2.5, 3.5));
  }
}