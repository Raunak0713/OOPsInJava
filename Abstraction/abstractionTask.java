package Abstraction;

abstract class Employee{
  abstract int calculateSalary();

  void displayEmployeeDetails(){
    System.out.println("Employee Details");
  }
}

class FullTimeEmployee extends Employee {
  int fixedMonthly;
  int monthsWorked;

  public FullTimeEmployee(int fixedMonthly, int monthsWorked){
    this.fixedMonthly = fixedMonthly;
    this.monthsWorked = monthsWorked;
  }

  @Override
  public int calculateSalary(){
    return fixedMonthly * monthsWorked;
  }
}

class ContractEmployee extends Employee{
  int fixedHour;
  int hoursWorked;

  public ContractEmployee(int fixedHour, int hoursWorked){
    this.fixedHour = fixedHour;
    this.hoursWorked = hoursWorked;
  }

  @Override
  public int calculateSalary(){
    return fixedHour * hoursWorked;
  }
}

public class abstractionTask{
  public static void main(String[] args) {
    Employee full = new FullTimeEmployee(20000, 4);
    Employee part = new ContractEmployee(600, 10);

    full.displayEmployeeDetails();
    System.out.println(full.calculateSalary());

    part.displayEmployeeDetails();
    System.out.println(part.calculateSalary());
  }
}