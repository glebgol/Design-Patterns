import carbrands.Audi;
import carbrands.BMW;
import carbrands.Mercedes;
import cartypes.Car;
import cartypes.CrossoverCar;
import cartypes.HatchbackCar;
import cartypes.SportCar;

public class CarClient {
    public static void main(String[] args) {
        Car bmwCrossover = new CrossoverCar(new BMW());
        bmwCrossover.run();

        Car audiSportCar = new SportCar(new Audi());
        audiSportCar.run();

        Car mercedesHatchback = new HatchbackCar(new Mercedes());
        mercedesHatchback.run();
    }
}
