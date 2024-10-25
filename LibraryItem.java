/**
 * Represents a library item, such as a book or periodical.
 * 
 * @author [Joshua Youden]
 */

public class LibraryItem {
    // Attributes
    private int id;
    private String title;
    private String author;
    private String ISBN;
    private String publisher;
    private int copyNum;


/**
     * Constructs a new LibraryItem with the specified attributes.
     * 
     * @param id        the unique identifier of the library item
     * @param title     the title of the library item
     * @param author    the author of the library item
     * @param ISBN      the International Standard Book Number of the library item
     * @param publisher the publisher of the library item
     * @param copyNum   the number of copies of the library item
     */
    
    // Constructors
    public LibraryItem(int id, String title, String author, String ISBN, String publisher, int copyNum) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.copyNum = copyNum;
    }

    /**
     * Constructs a new LibraryItem with default attributes.
     */
    public LibraryItem() {
        this(0, "", "", "", "", 0);
    }
    
    /**
     * Returns the unique identifier of the library item.
     * 
     * @return the id of the library item
     */
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

    // Method
    public String toString() {
        return "ID: {" + id + "} Title: {" + title + "} Author: {" + author + "} ISBN: {" + ISBN + "} Publisher: {" + publisher + "} Copy Number: {" + copyNum;
    }
}