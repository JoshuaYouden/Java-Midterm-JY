public class Author {
    // Attributes
    private String name;
    private String birthday;
    private LibraryItem writtenItem;

    // Constructor
    public Author(String name, String birthday, LibraryItem writtenItem) {
        this.name = name;
        this.birthday = birthday;
        this.writtenItem = writtenItem;
    }

    public Author() {
        this.name = "";
        this.birthday = "";
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public LibraryItem getWrittenItem() {
        return writtenItem;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setWrittenItem(LibraryItem writtenItem) {
        this.writtenItem = writtenItem;
    }

    // Methods
    public String toString() {
        return "Name: " + name + "\nBirthday: " + birthday + "\nItems Written: " + writtenItem;
    }
}
