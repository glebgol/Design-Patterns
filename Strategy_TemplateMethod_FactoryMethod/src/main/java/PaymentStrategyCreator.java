import strategies.CashPayment;
import strategies.IPaymentStrategy;
import strategies.MasterCardPayment;
import strategies.VisaCardPayment;

public class PaymentStrategyCreator {
    public static IPaymentStrategy create(String name) {
        String upperCaseName = name.toUpperCase();
        return switch (upperCaseName) {
            case "CASH" -> new CashPayment();
            case "MASTERCARD" -> new MasterCardPayment();
            case "VISA" -> new VisaCardPayment();
            default -> throw new IllegalArgumentException("There is not any " + name + " payment strategy.");
        };
    }
}
