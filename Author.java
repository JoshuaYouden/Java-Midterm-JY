import java.util.ArrayList;
import java.util.List;

/**
 * Represents an author, including their name and biographical information.
 * 
 * @author [Joshua Youden]
 */

public class Author {
    // Attributes
    private String name;
    private String birthday;
    private List<LibraryItem> writtenItems;

      /**
     * Constructs a new Author with the specified attributes.
     * 
     * @param name the name of the author
     * @param biography the biographical information of the author
     */

    // Constructor
    public Author(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        this.writtenItems = new ArrayList<>();

    }

    /**
     * Constructs a new Author with default attributes.
     */

    public Author() {
        this.name = "";
        this.birthday = "";
        this.writtenItems = new ArrayList<>();
    }
    
   /**
     * Returns the name of the author.
     * 
     * @return the name of the author
     */

    // Getters
    public String getName() {
        return name;
    }

     /**
     * Returns the birthday of the author.
     * 
     * @return the birthday of the author
     */

    public String getBirthday() {
        return birthday;
    }

     /**
     * Returns the written items of the author.
     * 
     * @return the written items of the author
     */

    public List<LibraryItem> getWrittenItems() {
        return writtenItems;
    }

    /**
     * Sets the name of the author.
     * 
     * @param firstName the news name of the author
     */

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sets the birthday of the author.
     * 
     * @param birthday the birthday of the author
     */

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * sets the written items of the author.
     * 
     * @param writtenItems the written items of the author
     */

    // Methods
    public void addWrittenItem(LibraryItem item) {
        writtenItems.add(item);
    }

    /**
     * edits the name and birthday of the author.
     * 
     * @param name the name of the author
     * @param birthday the birthday of the author
     */

    public void editAuthor(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    /**
     * Returns a string representation of the author, including their full name.
     * 
     * @return a string representation of the author
     */

    @Override
    public String toString() {
        return "Name: {" + name + "} Birthday: {" + birthday + "} Items Written: {" + writtenItems + "}";
    }
}
