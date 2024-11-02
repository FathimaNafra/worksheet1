public class LibrarySystem {
    public static void main(String[] args) {
        // Creating book instances
        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975", true);
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721", true);
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623", true);

        // Creating library instance
        Library library = new Library();

        // Adding books to the library
        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(book3);

        // Displaying library information
        library.displayLibraryInfo();

        // Listing all available items
        library.listAvailableItems();

        // Checking out a book
        library.checkoutItem("Island of a Thousand Mirrors");

        // Listing all available items after checkout
        library.listAvailableItems();
    }
}

