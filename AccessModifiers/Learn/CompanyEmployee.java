package AccessModifiers.Learn;

public class CompanyEmployee{
  public String name = "Employee";
  protected int id = 10;
  String department = "Sales";
  private double salary = 50000;

  public void displayEmployeeInfo(){
    System.out.println("Employee Info: Name = " + name + ", ID = " + id + ", Department = " + department);
  }

  protected void calculateBonus(){
    System.out.println("Bonus : " + (0.1 * salary));
  }
}