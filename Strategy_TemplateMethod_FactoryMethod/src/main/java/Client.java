import factorymethods.PaymentStrategyFactory;
import factorymethods.ShopFactory;
import shop.baseshops.Shop;
import shop.purchases.IPurchase;
import shop.purchases.Purchase;
import strategies.IPaymentStrategy;

public class Client {
    public static void main(String[] args) {
        ShopFactory shopFactory = new ShopFactory();
        PaymentStrategyFactory paymentStrategyFactory = new PaymentStrategyFactory();

        Shop shop = shopFactory.create("hit");
        IPaymentStrategy paymentStrategy = paymentStrategyFactory.create("mastercard");
        shop.setPaymentStrategy(paymentStrategy);

        IPurchase purchase = new Purchase(100);

        shop.orderPurchase(purchase);
    }
}
