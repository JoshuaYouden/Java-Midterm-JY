public class Students extends Patron {
    // Constructors
    public Students(String name, String address, String phone) {
        super(name, address, phone, null);
    }

    public Students() {
        super();
    }

    
    /** 
     * @return String
     */
    // Method
    @Override
    public String getPatronType() {
        return "Student";
    }
}
