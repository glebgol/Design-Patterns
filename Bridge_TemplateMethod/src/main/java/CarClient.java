import cartypes.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Car bmwCrossover = context.getBean("bmwCrossover", Car.class);
        bmwCrossover.run();

        Car audiSportCar = context.getBean("audiSportCar", Car.class);
        audiSportCar.run();

        Car mercedesHatchback = context.getBean("mercedesHatchback", Car.class);
        mercedesHatchback.run();
    }
}
