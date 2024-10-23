import java.util.ArrayList;
import java.util.List;

public class Author {
    // Attributes
    private String name;
    private String birthday;
    private List<LibraryItem> writtenItems;


    // Constructor
    public Author(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        this.writtenItems = new ArrayList<>();

    }

    public Author() {
        this.name = "";
        this.birthday = "";
        this.writtenItems = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public List<LibraryItem> getWrittenItems() {
        return writtenItems;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    // Methods
    public void addWrittenItem(LibraryItem item) {
        writtenItems.add(item);
    }

    public void editAuthor(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Name: {" + name + "} Birthday: {" + birthday + "} Items Written: {" + writtenItems + "}";
    }
}
