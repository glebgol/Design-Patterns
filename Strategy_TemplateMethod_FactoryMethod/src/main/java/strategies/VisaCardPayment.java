package strategies;

public class VisaCardPayment implements IPaymentStrategy {
    @Override
    public void pay(double price) {
        System.out.println("Visa payment: " + price);
    }

    @Override
    public boolean isAvailable() {
        // open connection to visa card
        // check available
        return true;
    }
}
