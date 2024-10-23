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

    public List<Author> searchAuthors(String query) {
        List<Author> result = new ArrayList<>();
        for (Author author : authors) {
            if (author.getName().contains(query) || author.getBirthday().contains(query)) {
                result.add(author);
            }
        }
        return result;
    }

    public List<Patron> searchPatrons(String query) {
        List<Patron> result = new ArrayList<>();
        for (Patron patron : patrons) {
            if (patron.getName().contains(query) || patron.getAddress().contains(query) || patron.getPhone().contains(query)) {
                result.add(patron);
            }
        }
        return result;
    }

    public void borrowItem(Patron patron, LibraryItem item) {
        if (item.getCopyNum() > 0) {
            patron.borrowItem(item);
            item.setCopyNum(item.getCopyNum() - 1);
            System.out.println("Item checked out: " + item.getTitle() + " by: " + patron.getName());
        } else {
            System.out.println("Item is currently checked out.");
        }
    }

    public void returnItem(Patron patron, LibraryItem item) {
        patron.returnItem(item);
        item.setCopyNum(item.getCopyNum() + 1);
        System.out.println("Item returned: " + item.getTitle() + " by " + patron.getName());
    }

    public void addLibraryItem(LibraryItem item) {
        libraryItems.add(item);
    }

    public void editLibraryItem(int id, String newTitle, String newAuthor, String newISBN, String newPublisher, int newCopyNum) {
        for (LibraryItem libraryItem : libraryItems) {
            if (libraryItem.getId() == id) {
                libraryItem.setTitle(newTitle);
                libraryItem.setAuthor(newAuthor);
                libraryItem.setISBN(newISBN);
                libraryItem.setPublisher(newPublisher);
                libraryItem.setCopyNum(newCopyNum);
                System.out.println("Library item updated: " + newTitle);
                return;
            }
        }
    }

    public void deleteLibraryItem(LibraryItem item) {
        libraryItems.remove(item);
        System.out.println("Library item removed: " + item.getTitle());
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

    public void editPatron(String currentName, String newName, String newAddress, String newPhone) {
        for (Patron patron : patrons) {
            if (patron.getName().equals(currentName)) {
                patron.editPatron(newName, newAddress, newPhone);
                System.out.println("Patron details updated: " + newName);
                return;
            }
        }
    }

    public void deletePatron(Patron patron) {
        patrons.remove(patron);
        System.out.println("Patron removed: " + patron.getName());
    }
}
