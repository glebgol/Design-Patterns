package observers;

public class Police implements IObserver {
    @Override
    public void update(String eventType) {
        System.out.println("Police: " + eventType);
    }
}
