import java.util.ArrayList;
import java.util.List;

public class Library extends Patron {
    // Attributes
    private List<LibraryItem> libraryItems;
    private List<Author> authors;
    private List<Patron> patrons;

    // Constructors
    public Library(List<LibraryItem> libraryItems, List<Author> authors, List<Patron> patrons) {
        this.libraryItems = libraryItems;
        this.authors = authors;
        this.patrons = patrons;
    }

    public Library() {
        this.libraryItems = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Methods

    public List<LibraryItem> searchItems(String query) {
        List<LibraryItem> result = new ArrayList<>();
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().contains(query) || item.getAuthor().contains(query) || item.getISBN().contains(query)) {
                result.add(item);
            }
        }
        return result;
    }

    public void borrowItem(Patron patron, LibraryItem item) {
        if (item.getCopyNum() > 0) {
            patron.borrowItem(item);
            item.setCopyNum(item.getCopyNum() - 1);
        } else {
            System.out.println("Item is currently checked out.");
        }
    }

    public void returnItem(Patron patron, LibraryItem item) {
        patron.returnItem(item);
        item.setCopyNum(item.getCopyNum() + 1);
    }

    public void addLibraryItem(LibraryItem item) {
        libraryItems.add(item);
    }

    public void editLibraryItem(LibraryItem item) {
        libraryItems.remove(item);
        libraryItems.add(item);
    }

    public void deleteLibraryItem(LibraryItem item) {
        libraryItems.remove(item);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void editAuthor(String currentName, String newName, String newBirthday) {
        for (Author author : authors) {
            if (author.getName().equals(currentName)) {
                author.editAuthor(newName, newBirthday);
                System.out.println("Author details updated: " + newName);
                return;
            }
        }
    }

    public void deleteAuthor(String name) {
        for (Author author : authors) {
            if (author.getName().equals(name)) {
                authors.remove(author);
                System.out.println("Author removed: " + name);
                return;
            }
        }
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void editPatron(Patron patron) {
        patrons.remove(patron);
        patrons.add(patron);
    }

    public void deletePatron(Patron patron) {
        patrons.remove(patron);
    }
}
