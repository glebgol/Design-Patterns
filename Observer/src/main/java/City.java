import observers.Ambulance;
import observers.FireDepartment;
import observers.IObserver;
import observers.Police;
import publisher.DispatcherService;
import publisher.IPublisher;

import java.util.List;

public class City {
    public static void main(String[] args) {
        IPublisher publisher = new DispatcherService(List.of("booom"));

        IObserver observer1 = new Ambulance();
        IObserver observer2 = new FireDepartment();
        IObserver observer3 = new Police();

        publisher.addObserver("booom", observer1);
        publisher.addObserver("booom", observer2);
        publisher.addObserver("booom", observer3);

        publisher.notifyObservers("booom");
    }
}
