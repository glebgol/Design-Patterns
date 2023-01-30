package carbrands;

public class Audi implements ICarBrand {
    final String name = "Audi";
    @Override
    public void openCar() {
        System.out.println("Opening Audi");
    }

    @Override
    public void start() {
        System.out.println("Start the Audi engine");
    }

    @Override
    public void closeCar() {
        System.out.println("Closing Audi");
    }

    @Override
    public String getName() {
        return name;
    }
}
