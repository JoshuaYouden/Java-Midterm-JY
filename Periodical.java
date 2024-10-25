/**
 * Represents a periodical, such as a journal or magazine.
 * 
 * @author [Joshua Youden]
 */

public class Periodical extends LibraryItem {
    // Attribute
    private PeriodicalType type;


    /**
     * Enumerates the possible types of periodicals.
     */
    // Enum Class
    public enum PeriodicalType {
        /**
         * A printed periodical.
         */
        PRINTED,
        /**
         * An electronic periodical.
         */
        ELECTRONIC
    }

    /**
     * Constructs a new Periodical with the specified attributes.
     * 
     * @param id        the unique identifier of the periodical
     * @param title     the title of the periodical
     * @param author    the author of the periodical
     * @param ISBN      the International Standard Book Number of the periodical
     * @param publisher the publisher of the periodical
     * @param copyNum   the number of copies of the periodical
     * @param type      the type of periodical
     */

    // Constructors
    public Periodical(int id, String title, String author, String ISBN, String publisher, int copyNum, PeriodicalType type) {
        super(id, title, author, ISBN, publisher, copyNum);
        this.type = type;
    }

    /**
     * Constructs a new Periodical with default attributes.
     */

    public Periodical(){
        super();
        this.type = null;
    }

    
   
    /**
     * Returns the type of periodical.
     * 
     * @return the type of periodical
     */

    // Getter and Setter
    public PeriodicalType getType() {
        return type;
    }

    /**
     * Sets the type of periodical.
     * 
     * @param type the new type of periodical
     */
    
    public void setType(PeriodicalType type) {
        this.type = type;
    }

    /**
     * Returns a string representation of the periodical, including its type.
     * 
     * @return a string representation of the periodical
     */

    // Method
    @Override
    public String toString() {
        return super.toString() + "} Type: {" + type + "}";
    }
}
