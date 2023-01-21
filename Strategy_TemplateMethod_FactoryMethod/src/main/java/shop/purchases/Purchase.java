package shop.purchases;

import java.time.LocalDate;

public class Purchase implements IPurchase {
    protected double price;
    protected LocalDate date;

    public Purchase(double price) {
        this.price = price;
        date = LocalDate.now();
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public LocalDate getDate() {
        return date;
    }
}
