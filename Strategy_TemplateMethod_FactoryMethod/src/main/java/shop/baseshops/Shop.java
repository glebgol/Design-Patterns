package shop.baseshops;

import shop.purchases.IPurchase;
import strategies.IPaymentStrategy;
import templatemethods.DiscountAccrual;

public abstract class Shop {
    protected DiscountAccrual discountAccrual;
    protected IPaymentStrategy paymentStrategy;
    public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public abstract void orderPurchase(IPurchase purchase);
}
