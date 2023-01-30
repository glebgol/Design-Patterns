package cartypes;

import carbrands.ICarBrand;

public class SportCar extends Car {
    public SportCar(ICarBrand brand) {
        super(brand);
    }

    @Override
    protected void drive() {
        System.out.println("Driving Hatchback");
    }

    @Override
    protected void start() {
        System.out.println("Step on the pedal and let's go");
        super.start();
    }
}
