package strategies;

public interface IPaymentStrategy {
    void pay(double price);
    boolean isAvailable();
}
