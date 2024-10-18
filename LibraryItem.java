public class LibraryItem {
    // Attributes
    private int id;
    private String title;
    private String author;
    private String ISBN;
    private String publisher;
    private int copyNum;
    private String itemType;

    // Constructors
    public LibraryItem(int id, String title, String author, String ISBN, String publisher, int copyNum, String itemType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.copyNum = copyNum;
        this.itemType = itemType;
    }

    public LibraryItem() {
        this(0, "", "", "", "", 0, "");
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getCopyNum() {
        return copyNum;
    }

    public String getItemType() {
        return itemType;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCopyNum(int copyNum) {
        this.copyNum = copyNum;
    }

    // Methods
    public void addItem() {
    }

    public void editItem() {
    }

    public void removeItem() {
    }

    public String toString() {
        return "ID: " + id + "\nTitle: " + title + "\nAuthor: " + author + "\nISBN: " + ISBN + "\nPublisher: " + publisher + "\nCopy Number: " + copyNum;
    }
}