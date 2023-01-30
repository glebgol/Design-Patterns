package cartypes;

import carbrands.ICarBrand;

public class HatchbackCar extends Car {
    public HatchbackCar(ICarBrand brand) {
        super(brand);
    }

    @Override
    protected void drive() {
        System.out.println("Driving Hatchback");
    }

    @Override
    protected void open() {
        System.out.println("Open Hatchback");
        super.open();
    }
}
