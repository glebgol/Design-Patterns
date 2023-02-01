package observers;

public class Ambulance implements IObserver {
    @Override
    public void update(String eventType) {
        System.out.println("Ambulance is called: " + eventType);
    }
}
