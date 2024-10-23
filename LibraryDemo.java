public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books
        Books book1 = new Books(1, "1984", "George Orwell", "1234567890", "Secker & Warburg", 3, Books.BookType.PRINTED);
        Books book2 = new Books(2, "Harry Potter", "J.K. Rowling", "1234567891", "Bloomsbury", 5, Books.BookType.ELECTRONIC);

        // Add periodicals
        Periodical periodical1 = new Periodical(3, "Nature Journal", "Various", "9876543210", "Nature Publishing Group", 7, 
        Periodical.PeriodicalType.PRINTED);
        Periodical periodical2 = new Periodical(4, "Tech Today", "Various", "9876543211", "Tech Publishing", 2, 
        Periodical.PeriodicalType.ELECTRONIC);

        System.out.println();
        library.addLibraryItem(book1);
        library.addLibraryItem(book2);

        library.addLibraryItem(periodical1);
        library.addLibraryItem(periodical2);

        //Display all library items
        System.out.println("Library Items: ");
        for (LibraryItem item : library.searchItems("")) {
            System.out.println(item.toString());
        }

        // Edit a book
        System.out.println();
        library.editLibraryItem(2, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", "1234567891", "Bloomsbury", 5);

        // Delete a periodical
        System.out.println();
        library.deleteLibraryItem(periodical2);

        System.out.println();
        System.out.println("New Library Items: ");
        for (LibraryItem item : library.searchItems("")) {
            System.out.println(item.toString());
        }

        // Add authors
        Author author1 = new Author("George Orwell", "1903-06-25");
        Author author2 = new Author("J.K. Rowling", "1965-07-31");
        
        // Add written items
        author1.addWrittenItem(book1);
        author2.addWrittenItem(book2);

        library.addAuthor(author1);
        library.addAuthor(author2);

        //Display all authors
        System.out.println();
        System.out.println("Authors: ");
        for (Author author : library.searchAuthors("")) {
            System.out.println(author.toString());
        }

        // Edit an author
        System.out.println();
        library.editAuthor("J.K. Rowling", "Joanne Rowling", "1965-07-31");

        // Delete an author
        System.out.println();
        library.deleteAuthor("George Orwell");

        System.out.println();
        System.out.println("New Authors: ");
        for (Author author : library.searchAuthors("")) {
            System.out.println(author.toString());
        }

        // Add patrons
        Patron patron1 = new Students("John Doe", "123 Main St", "123-456-7890");
        Patron patron2 = new Students("Jane Doe", "456 Oak Ave", "987-654-3210");
        Patron patron3 = new Employee("Bob Smith", "789 Pine St", "555-555-5555");

        library.addPatron(patron1);
        library.addPatron(patron2);
        library.addPatron(patron3);

        //Display all patrons
        System.out.println();
        System.out.println("Patrons: ");
        for (Patron patron : library.searchPatrons("")) {
            System.out.println(patron.toString());
        }

        // Edit a patron
        System.out.println();
        library.editPatron("Bob Smith", "Bob Smith Jr.", "789 Pine St", "555-555-5555");

        // Delete a patron
        System.out.println();
        library.deletePatron(patron2);

        System.out.println();
        System.out.println("New Patrons: ");
        for (Patron patron : library.searchPatrons("")) {
            System.out.println(patron.toString());
        }

        // Borrow an item
        System.out.println();
        library.borrowItem(patron1, book1);
        library.borrowItem(patron3, periodical1);

        // Return an item
        System.out.println();
        library.returnItem(patron3, periodical1);

        System.out.println();
        System.out.println("Final Library Items: ");
        for (LibraryItem item : library.searchItems("")) {
            System.out.println(item.toString());
        }
    }
}
