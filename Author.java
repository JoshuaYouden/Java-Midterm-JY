public class Author extends LibraryItem {
    // Attributes
    private String name;
    private String birthday;
    private int numAuthors;


    // Constructor
    public Author(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        numAuthors = 0;

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
    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    // Methods


    public boolean addAuthor(String authors) {
        for (int i = 0; i < numAuthors; i++) {
            if (name.equals(authors)) return false;
            }
            name = "";
            birthday = "";
            numAuthors++;
            return true;
        }

    public void editAuthor() {
        name = new String();
        birthday = new String();
    }

    public boolean removeAuthor(String authors) {
        boolean found = false;
        int authorIndex = -1;
        for (int i = 0; i < numAuthors; i++) {
            if (name.equals(authors)) {
                authorIndex = i;
                found = true;
                break;
            }
        }
        if (found) {
            for (int i = authorIndex; i < numAuthors - 1; i++) {
                authors = authors;
            }
            numAuthors--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nBirthday: " + birthday + "\nItems Written: ";
    }
}
