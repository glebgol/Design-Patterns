import shop.baseshops.Shop;
import shop.purchases.IPurchase;
import shop.purchases.Purchase;
import strategies.IPaymentStrategy;

public class Client {
    public static Shop shop = ShopCreator.create("hit");
    public static void main(String[] args) {
        IPaymentStrategy paymentStrategy = PaymentStrategyCreator.create("mastercard");
        shop.setPaymentStrategy(paymentStrategy);

        IPurchase purchase = new Purchase(100);

        shop.orderPurchase(purchase);
    }
}
