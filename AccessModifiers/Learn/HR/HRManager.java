package AccessModifiers.Learn.HR;
import AccessModifiers.Learn.CompanyEmployee;

public class HRManager extends CompanyEmployee{
  public void displayDetails(){
    System.out.println("name is public so hr can access it " + name);
    System.out.println("id is protected but hr is extending employee so it can access that " + id);
    System.out.println("hr cannot access department because department is default(package-private) so no matter if hr extends to the class or not it cant access string " /*department*/);
    System.out.println("since salary is proctected anyone in another class cannot access it");
    calculateBonus();
  }
}