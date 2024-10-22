public class Employee extends Patron {
    // Methods
    public Employee(String name, String address, String phone) {
        super(name, address, phone, null);
    }

    public Employee() {
        super();
    }

    @Override
    public String getPatronType() {
        return "Employee";
    }
}
