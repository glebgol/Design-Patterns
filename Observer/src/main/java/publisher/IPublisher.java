package publisher;

import observers.IObserver;

public interface IPublisher {
    void addObserver(String eventType, IObserver observer);
    void removeObserver(String eventType, IObserver observer);
    void notifyObservers(String eventType);
}
