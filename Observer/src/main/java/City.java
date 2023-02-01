import observers.IObserver;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import publisher.IPublisher;

public class City {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        IPublisher publisher = context.getBean("publisher", IPublisher.class);

        IObserver observer1 = context.getBean("ambulance", IObserver.class);
        IObserver observer2 = context.getBean("fireDepartment", IObserver.class);
        IObserver observer3 = context.getBean("police", IObserver.class);

        publisher.addObserver("booom", observer1);
        publisher.addObserver("booom", observer2);
        publisher.addObserver("fire!!", observer2);
        publisher.addObserver("booom", observer3);

        publisher.notifyObservers("booom");
        publisher.notifyObservers("fire!!");

    }
}
