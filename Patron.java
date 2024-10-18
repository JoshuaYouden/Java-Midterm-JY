public class Patron {
    private String name;
    private String address;
    private String phone;
    private LibraryItem borrowedItem;
    private String patronType;

    // Constructors
    public Patron(String name, String address, String phone, LibraryItem borrowedItem, String patronType) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.borrowedItem = borrowedItem;
        this.patronType = patronType;
    }

    public Patron() {
        this.name = "";
        this.address = "";
        this.phone = "";
        this.borrowedItem = null;
        this.patronType = "";
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

    public LibraryItem getBorrowedItem() {
        return borrowedItem;
    }

    public String getPatronType() {
        return patronType;
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

    public void setBorrowedItem(LibraryItem borrowedItem) {
        this.borrowedItem = borrowedItem;
    }
    
    public void setPatronType(String patronType) {
        this.patronType = patronType;
    }

    // Methods
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone + "\nBorrowed Item: " + borrowedItem + "\nPatron Type: " + patronType;
    }
}
