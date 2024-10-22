import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String address;
    private String phone;
    private List<LibraryItem> borrowedItem;
    private String patronType;

    // Constructors
    public Patron(String name, String address, String phone, LibraryItem borrowedItem) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.borrowedItem = new ArrayList<>();
    }

    public Patron() {
        this.name = "";
        this.address = "";
        this.phone = "";
        this.borrowedItem = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getPatronType() {
        return patronType;
    }

    public List<LibraryItem> getBorrowedItem() {
        return borrowedItem;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Methods

    public void borrowItem(LibraryItem item) {
        borrowedItem.add(item);
    }

    public void returnItem(LibraryItem item) {
        borrowedItem.remove(item);
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone + "\nBorrowed Item: " + borrowedItem + "\nPatron Type: " + patronType;
    }
}
