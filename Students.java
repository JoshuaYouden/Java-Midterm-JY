/**
 * Represents an student.
 * 
 * @author [Your Name]
 */

public class Students extends Patron {

    /** 
     * Constructs a new student with the specified attributes.
     * 
     * @param name the employee's name
     * @param address the employee's address
     * @param phone the employee's phone number
     */

    // Constructors
    public Students(String name, String address, String phone) {
        super(name, address, phone, null);
    }

    /** 
     * Constructs a new student with default attributes.
     */

    public Students() {
        super();
    }

    
    /** 
     * Returns the patron's type.
     * 
     * @return String
     */

    // Method
    @Override
    public String getPatronType() {
        return "Student";
    }
}
