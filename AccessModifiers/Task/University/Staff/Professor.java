package AccessModifiers.Task.University.Staff;
import AccessModifiers.Task.University.Person;

public class Professor extends Person {

    public Professor(String name, int age, String address) {
        super(name, age, address);
    }

    @Override
    public String getName() {
      return "The Professor name is : " + name;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);             // Accessible (public)
        System.out.println("Age: " + age);               // Accessible (protected)
        
        // System.out.println("Role: " + role);          // Not accessible (default/package-private)
        System.out.println("Address: " + getAddress());  // Accessible via public getter
    }
}
