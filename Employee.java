public class Employee extends Patron {
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
