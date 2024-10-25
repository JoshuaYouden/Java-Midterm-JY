import java.util.ArrayList;
import java.util.List;

/**
 * Represents a patron, including their personal and contact information.
 * 
 * @author [Your Name]
 */

public class Patron {
    private String name;
    private String address;
    private String phone;
    private List<LibraryItem> borrowedItem;
    private String patronType;

    /**
     * Constructs a new Patron with the specified attributes.
     * 
     * @param name      the name of the patron
     * @param address   the address of the patron
     * @param phone     the phone number of the patron
     * @param borrowedItem the list of borrowed items of the patron
     */

    // Constructors
    public Patron(String name, String address, String phone, LibraryItem borrowedItem) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.borrowedItem = new ArrayList<>();
    }

    /**
     * Constructs a new Patron with default attributes.
     */

    public Patron() {
        this.name = "";
        this.address = "";
        this.phone = "";
        this.borrowedItem = new ArrayList<>();
    }

     /**
     * Returns the name of the patron.
     * 
     * @return the name of the patron
     */

    // Getters
    public String getName() {
        return name;
    }

     /**
     * Returns the address of the patron.
     * 
     * @return the address of the patron
     */

    public String getAddress() {
        return address;
    }

     /**
     * Returns the phone number of the patron.
     * 
     * @return the phone number of the patron
     */

    public String getPhone() {
        return phone;
    }

    /**
     * Returns the type of the patron.
     * 
     * @return the type of the patron
     */

    public String getPatronType() {
        return patronType;
    }

    /**
     * Returns the list of borrowed items of the patron.
     * 
     * @return the list of borrowed items of the patron
     */

    public List<LibraryItem> getBorrowedItem() {
        return borrowedItem;
    }

     /**
     * Sets the name of the patron.
     * 
     * @param name the new name of the patron
     */

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the address of the patron.
     * 
     * @param address the new address of the patron
     */

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets the phone number of the patron.
     * 
     * @param phone the new phone number of the patron
     */

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * borrows an item to the patron.
     * 
     * @param item the item to be borrowed by the patron
     */

    // Methods
    public void borrowItem(LibraryItem item) {
        borrowedItem.add(item);
    }

    /**
     * returns an item to the patron.
     * 
     * @param item the item to be returned by the patron
     */

    public void returnItem(LibraryItem item) {
        borrowedItem.remove(item);
    }

    /**
     * Edits the name, address, and phone number of the patron.
     * 
     * @param name the new name of the patron
     * @param address the new address of the patron
     * @param phone the new phone number of the patron
     */

    public void editPatron(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Returns a string representation of the patron, including their name and contact information.
     * 
     * @return a string representation of the patron
     */

    @Override
    public String toString() {
        return "Name: {" + name + "} Address: {" + address + "} Phone: {" + phone + "} Borrowed Item: {" + borrowedItem + "} Patron Type: {" + patronType + "}";
    }
}
