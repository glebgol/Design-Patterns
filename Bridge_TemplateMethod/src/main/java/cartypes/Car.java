package cartypes;

import carbrands.ICarBrand;

public abstract class Car {
    protected ICarBrand brand;

    public Car(ICarBrand brand) {
        this.brand = brand;
    }

    public void run() {
        open();
        start();
        drive();
        stop();
    }

    protected void open() {
        brand.openCar();
    }
    protected void start() {
        brand.start();
    }
    protected abstract void drive();
    protected void stop() {
        brand.closeCar();
    }
}
