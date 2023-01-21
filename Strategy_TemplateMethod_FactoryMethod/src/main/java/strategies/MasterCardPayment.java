package strategies;

public class MasterCardPayment implements IPaymentStrategy{
    @Override
    public void pay(double price) {
        System.out.println("MasterCard payment: " + price);
    }

    @Override
    public boolean isAvailable() {
        // open connection to master card
        // check available
        return true;
    }
}
