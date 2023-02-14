import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookFlyweight {
    private final String type;
    private String distributor;
    private final String otherData;
}
