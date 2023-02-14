import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Client {
    public static void main(String[] args) {
        Store store = new Store();
        for (int i = 0; i < 10_000; i++) {
            store.storeBook(getRandomString(), new Random().nextDouble(), "Action", "Follett", "Stuff");
            store.storeBook(getRandomString(), new Random().nextDouble(), "Fantasy", "Ingram", "Extra");
        }

        store.displayBooks();
    }

    private static String getRandomString() {
        byte[] array = new byte[7];
        new Random().nextBytes(array);

        return new String(array, StandardCharsets.UTF_8);
    }
}
