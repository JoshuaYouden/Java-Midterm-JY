public class Books extends LibraryItem {
    // Attributes
    private BookType type;

    // enum class
    public enum BookType {
        PRINTED, ELECTRONIC, AUDIO
    }

    // Constructors
    public Books(int id, String title, String author, String ISBN, String publisher, int copyNum, BookType type) {
        super(id, title, author, ISBN, publisher, copyNum);
        this.type = type;
    }

    public Books() {
        super();
        this.type = null;
    }

    
    /** 
     * @return BookType
     */
    // Getter and Setter
    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    // Method
    @Override
    public String toString() {
        return super.toString() + "} Type: {" + type + "}";
    }
}
