package observers;

public class FireDepartment implements IObserver {
    @Override
    public void update(String eventType) {
        System.out.println("FireDepartment is called: " + eventType);
    }
}
