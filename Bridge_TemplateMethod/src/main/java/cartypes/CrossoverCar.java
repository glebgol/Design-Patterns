package cartypes;


import carbrands.ICarBrand;

public class CrossoverCar extends Car {
    public CrossoverCar(ICarBrand brand) {
        super(brand);
    }

    @Override
    protected void drive() {
        System.out.println("Driving crossover");
    }

    @Override
    protected void stop() {
        System.out.println("Stop crossover");
        super.stop();
    }
}
