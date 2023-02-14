import lombok.Data;

@Data
public class Book {
    private final String name;
    private double price;
    private final BookFlyweight bookFlyweight;
}
