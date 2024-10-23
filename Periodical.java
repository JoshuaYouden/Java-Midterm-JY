public class Periodical extends LibraryItem {
    // Attribute
    private PeriodicalType type;

    // Enum Class
    public enum PeriodicalType {
        PRINTED, ELECTRONIC
    }

    // Constructors
    public Periodical(int id, String title, String author, String ISBN, String publisher, int copyNum, PeriodicalType type) {
        super(id, title, author, ISBN, publisher, copyNum);
        this.type = type;
    }

    public Periodical(){
        super();
        this.type = null;
    }

    // Getter and Setter
    public PeriodicalType getType() {
        return type;
    }

    public void setType(PeriodicalType type) {
        this.type = type;
    }

    // Method
    @Override
    public String toString() {
        return super.toString() + "} Type: {" + type + "}";
    }
}
