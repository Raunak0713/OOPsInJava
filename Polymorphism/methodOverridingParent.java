package Polymorphism;

class methodOverridingParent{
  public void doSomething(){
    System.out.println("Parent class doing something");
  }
}

class methodOverrdingChild extends methodOverridingParent {
  @Override
  public void doSomething(){
    System.out.println("Child class doing something");
  }
}
class methodOverridingPolymorphism{
  public static void main(String[] args) {
    methodOverridingParent m1 = new methodOverrdingChild();
    m1.doSomething();
  }
}