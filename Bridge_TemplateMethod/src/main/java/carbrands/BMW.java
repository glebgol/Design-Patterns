package carbrands;

public class BMW implements ICarBrand {
    final String name = "BMW";
    @Override
    public void openCar() {
        System.out.println("Opening BMW");
    }

    @Override
    public void start() {
        System.out.println("Start the BMW engine");
    }

    @Override
    public void closeCar() {
        System.out.println("Closing BMW");
    }

    @Override
    public String getName() {
        return name;
    }
}
