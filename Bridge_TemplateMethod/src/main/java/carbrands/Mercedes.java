package carbrands;

public class Mercedes implements ICarBrand {
    final String name = "Mercedes";

    @Override
    public void openCar() {
        System.out.println("Opening Mercedes");
    }

    @Override
    public void start() {
        System.out.println("Start the Mercedes engine");
    }

    @Override
    public void closeCar() {
        System.out.println("Closing Mercedes");
    }

    @Override
    public String getName() {
        return name;
    }
}
