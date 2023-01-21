package shop.baseshops;

import shop.purchases.IPurchase;
import templatemethods.EvrooptDiscountAccrual;

public abstract class EvrooptShopBase extends Shop {
    public EvrooptShopBase() {
        discountAccrual = new EvrooptDiscountAccrual();
    }

    @Override
    public void orderPurchase(IPurchase purchase) {
        if (!paymentStrategy.isAvailable()) {
            System.out.println("Not available!");
            return;
        }
        System.out.println("orderPurchase!!!");
        discountAccrual.discountAccrual();
        System.out.println("EvrooptShop orderPurchase " + purchase.getDate() + " " + purchase.getPrice());
        paymentStrategy.pay(purchase.getPrice());
    }
}
