import org.example.Book;
import org.example.Client;
import org.example.Library;
import org.junit.Test;

public class LibraryTest {

    @Test
    public void testDisplayBorrowedItems() {
        Library library = new Library();
        Client client = new Client(1, "John Doe", "123 Main St, City", "839489384");
        Book book3 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 1925);
        library.registerClient(client);
        library.addItem(book3);
        library.checkOutItem(book3, client);

        library.displayBorrowedItems();
    }
}
