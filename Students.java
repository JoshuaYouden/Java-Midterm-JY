public class Students extends Patron {
    // Methods
    public Students(String name, String address, String phone) {
        super(name, address, phone, null);
    }

    public Students() {
        super();
    }

    @Override
    public String getPatronType() {
        return "Student";
    }
}
