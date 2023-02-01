package publisher;

import observers.IObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DispatcherService implements IPublisher {
    protected HashMap<String, List<IObserver>> observers = new HashMap<>();

    public DispatcherService(List<String> eventTypes) {
        for (var eventType : eventTypes) {
            addEventType(eventType);
        }
    }
    public void addEventType(String eventType) {
        observers.put(eventType, new ArrayList<>());
    }

    @Override
    public void addObserver(String eventType, IObserver observer) {
        observers.get(eventType).add(observer);
    }

    @Override
    public void removeObserver(String eventType, IObserver observer) {
        List<IObserver> eventTypeObservers = observers.get(eventType);
        eventTypeObservers.remove(observer);
    }

    @Override
    public void notifyObservers(String eventType) {
        List<IObserver> eventTypeObservers = observers.get(eventType);

        for (var observer : eventTypeObservers) {
            observer.update(eventType);
        }
    }
}
