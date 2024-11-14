package AccessModifiers.Task.University;

public class Person {
    public String name;
    protected int age;
    String role;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.role = "student";
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
