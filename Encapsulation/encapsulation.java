package Encapsulation;

class Person {
  private String name;
  private int age;

  public Person(String name, int age){
    setName(name);
    setAge(age);
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int age){
    if(age >= 0){
      this.age = age;
    }
    else{
      System.out.println("Age cannot be negetive");
    }
  }

  public void displayInfo(){
    System.out.println("Name : " + name + ", Age : " + age);
  }
}

public class encapsulation{
  public static void main(String[] args) {
    Person p1 = new Person("Raunak", 21);
    p1.displayInfo();

    p1.setAge(-5);
    p1.displayInfo();
    p1.setAge(25);
    p1.displayInfo();
  }
}