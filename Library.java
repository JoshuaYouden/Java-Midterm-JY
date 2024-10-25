import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library, including its collection of items, authors, and patrons.
 * 
 * @author [Joshua Youden]
 */

public class Library extends Patron {
    // Attributes
    private List<LibraryItem> libraryItems;
    private List<Author> authors;
    private List<Patron> patrons;

    /**
     * Constructs a new Library with the specified attributes.
     * @param libraryItems the list of items in the library
     * @param authors the list of authors
     * @param patrons the list of patrons
     */

    // Constructors
    public Library(List<LibraryItem> libraryItems, List<Author> authors, List<Patron> patrons) {
        this.libraryItems = libraryItems;
        this.authors = authors;
        this.patrons = patrons;
    }

    /**
     * Constructs a new Library with default attributes.
     */

    public Library() {
        this.libraryItems = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    
    /**
     * Searches the library for items that match the given query.
     * @param query the query to search for
     * @return a list of matching items
     */

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

    /**
     * Searches the library for authors, that match the given query.
     * @param query the query to search for
     * @return a list of matching authors
     */


    public List<Author> searchAuthors(String query) {
        List<Author> result = new ArrayList<>();
        for (Author author : authors) {
            if (author.getName().contains(query) || author.getBirthday().contains(query)) {
                result.add(author);
            }
        }
        return result;
    }

    /**
     * Searches the library for patrons that match the given query.
     * @param query the query to search for
     * @return a list of matching patrons
     */


    public List<Patron> searchPatrons(String query) {
        List<Patron> result = new ArrayList<>();
        for (Patron patron : patrons) {
            if (patron.getName().contains(query) || patron.getAddress().contains(query) || patron.getPhone().contains(query)) {
                result.add(patron);
            }
        }
        return result;
    }

    /**
     * borrows an item to a patron.
     * @param patron the patron that will borrow the item
     * @param item the item to be borrowed
     */

    public void borrowItem(Patron patron, LibraryItem item) {
        if (item.getCopyNum() > 0) {
            patron.borrowItem(item);
            item.setCopyNum(item.getCopyNum() - 1);
            System.out.println("Item checked out: " + item.getTitle() + " by: " + patron.getName());
        } else {
            System.out.println("Item is currently checked out.");
        }
    }

    /**
     * returns an item from a patron
     * @param patron the patron that borrowed the item
     * @param item the item to be returned
     */

    public void returnItem(Patron patron, LibraryItem item) {
        patron.returnItem(item);
        item.setCopyNum(item.getCopyNum() + 1);
        System.out.println("Item returned: " + item.getTitle() + " by " + patron.getName());
    }

    /**
     * adds an item to the library
     * @param item the item to be added
     */

    public void addLibraryItem(LibraryItem item) {
        libraryItems.add(item);
    }

    /**
     * edits an item in the library
     * @param id the id of the item to be edited
     * @param newTitle the new title of the item
     * @param newAuthor the new author of the item
     * @param newISBN the new ISBN of the item
     * @param newPublisher the new publisher of the item
     * @param newCopyNum the new copy number of the item
     */

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

    /**
     * deletes an item from the library
     * @param item the item to be deleted
     */

    public void deleteLibraryItem(LibraryItem item) {
        libraryItems.remove(item);
        System.out.println("Library item removed: " + item.getTitle());
    }

    /**
     * adds an author to the library
     * @param author the author to be added
     */

    public void addAuthor(Author author) {
        authors.add(author);
    }

    /**
     * edits an author in the library
     * @param currentName the name of the author to be edited
     * @param newName the new name of the author
     * @param newBirthday the new birthday of the author
     */

    public void editAuthor(String currentName, String newName, String newBirthday) {
        for (Author author : authors) {
            if (author.getName().equals(currentName)) {
                author.editAuthor(newName, newBirthday);
                System.out.println("Author details updated: " + newName);
                return;
            }
        }
    }

    /**
     * deletes an author from the library
     * @param author the author to be deleted
     */

    public void deleteAuthor(String name) {
        for (Author author : authors) {
            if (author.getName().equals(name)) {
                authors.remove(author);
                System.out.println("Author removed: " + name);
                return;
            }
        }
    }

    /**
     * adds a patron to the library
     * @param patron the patron to be added
     */

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    /**
     * edits a patron in the library
     * @param currentName the name of the patron to be edited
     * @param newName the new name of the patron
     * @param newAddress the new address of the patron
     * @param newPhone the new phone number of the patron
     */

    public void editPatron(String currentName, String newName, String newAddress, String newPhone) {
        for (Patron patron : patrons) {
            if (patron.getName().equals(currentName)) {
                patron.editPatron(newName, newAddress, newPhone);
                System.out.println("Patron details updated: " + newName);
                return;
            }
        }
    }

    /**
     * deletes a patron from the library
     * @param patron the patron to be deleted
     */

    public void deletePatron(Patron patron) {
        patrons.remove(patron);
        System.out.println("Patron removed: " + patron.getName());
    }
}
