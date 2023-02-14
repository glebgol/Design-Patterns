import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Book> books = new ArrayList<>();

    public void storeBook(String name, double price, String type, String distributor, String otherData) {
        BookFlyweight bookFlyweight = BookFactory.getBookFlyweight(name, distributor, otherData);
        books.add(new Book(name, bookFlyweight));
    }

    public void displayBooks() {
        for (var book : books) {
            System.out.println(book);
        }
    }
}
