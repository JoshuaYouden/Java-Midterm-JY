/**
 * Represents a book, including its title, author, and publication information.
 * 
 * @author [Joshua Youden]
 */

public class Books extends LibraryItem {
    // Attributes
    private BookType type;

    // enum class
    public enum BookType {
        PRINTED, ELECTRONIC, AUDIO
    }


    /**
     * Constructs a new Book with the specified attributes.
     * 
     * @param id        the unique identifier of the book
     * @param title     the title of the book
     * @param author    the author of the book
     * @param ISBN      the International Standard Book Number of the book
     * @param publisher the publisher of the book
     * @param publicationYear the year the book was published
     * @param edition   the edition number of the book
     * @param copyNum   the number of copies of the book
     */

    // Constructors
    public Books(int id, String title, String author, String ISBN, String publisher, int copyNum, BookType type) {
        super(id, title, author, ISBN, publisher, copyNum);
        this.type = type;
    }

     /**
     * Constructs a new Book with default attributes.
     */

    public Books() {
        super();
        this.type = null;
    }

    // Getter and Setter
    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }


    /**
     * Returns a string representation of the book, including its publication information.
     * 
     * @return a string representation of the book
     */

    // Method
    @Override
    public String toString() {
        return super.toString() + "} Type: {" + type + "}";
    }
}
