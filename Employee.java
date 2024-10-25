public class Employee extends Patron {
    // Constructors
    public Employee(String name, String address, String phone) {
        super(name, address, phone, null);
    }

    public Employee() {
        super();
    }

    // Method
    @Override
    public String getPatronType() {
        return "Employee";
    }
}
