import java.util.ArrayList;

class Library {
    private ArrayList<BorrowableItems> borrowableItemsList;


    public Library() {
        borrowableItemsList = new ArrayList<>();
    }


    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Checked out: " + title);
                    return;
                }
            }
        }
        System.out.println("Item not available or does not exist.");
    }


    public void listAvailableItems() {
        System.out.println("Available Library Items:");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book && ((Book) item).isAvailable()) {
                item.displayInfo();
                System.out.println("----------");
            }
        }
    }


    public void displayLibraryInfo() {
        int availableCount = 0;
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book && ((Book) item).isAvailable()) {
                availableCount++;
            }
        }
        System.out.println("Total Library Items: " + borrowableItemsList.size());
        System.out.println("Available Items: " + availableCount);
    }
}
