import java.util.HashMap;

public class BookFactory {
    private static final HashMap<String, BookFlyweight> bookFlyweightHashMap = new HashMap<>();

    public static BookFlyweight getBookFlyweight(String type, String distributor, String otherData) {
        if (bookFlyweightHashMap.get(type) == null) {
            bookFlyweightHashMap.put(type, new BookFlyweight(type, distributor, otherData));
        }
        return bookFlyweightHashMap.get(type);
    }
}
