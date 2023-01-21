package strategies;

public class CashPayment implements IPaymentStrategy {
    @Override
    public void pay(double price) {
        System.out.println("Cash payment: " + price);
    }

    @Override
    public boolean isAvailable() {
        return true;
    }
}
