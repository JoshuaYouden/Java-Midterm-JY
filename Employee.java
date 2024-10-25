/**
 * Represents an employee.
 * 
 * @author [Your Name]
 */

public class Employee extends Patron {

    /** 
     * Constructs a new employee with the specified attributes.
     * 
     * @param name the employee's name
     * @param address the employee's address
     * @param phone the employee's phone number
     */

    // Methods
    public Employee(String name, String address, String phone) {
        super(name, address, phone, null);
    }

     /**
     * Constructs a new Employee with default attributes.
     */

    public Employee() {
        super();
    }

    
    /** 
     * Returns the patron's type.
     * 
     * @return String
     */

    @Override
    public String getPatronType() {
        return "Employee";
    }
}
