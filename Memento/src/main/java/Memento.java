import java.time.LocalDateTime;

public class Memento {
    private final String state;
    private final LocalDateTime localDateTime;

    protected Memento(String state) {
        this.state = state;
        localDateTime = LocalDateTime.now();
    }

    public String getState() {
        return state;
    }

    public LocalDateTime getMementoTime() {
        return localDateTime;
    }

    @Override
    public String toString() {
        return state + " " + localDateTime.toLocalTime();
    }
}
