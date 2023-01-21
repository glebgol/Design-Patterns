package shop;

import shop.baseshops.Shop;
import shop.purchases.IPurchase;
import templatemethods.VitalurDiscountAccrual;

public class VitalurShop extends Shop {
    public VitalurShop() {
        discountAccrual = new VitalurDiscountAccrual();
    }
    @Override
    public void orderPurchase(IPurchase purchase) {
        if (!paymentStrategy.isAvailable()) {
            System.out.println("Not available!");
            return;
        }
        System.out.println("VitalurShop orderPurchase!!!");
        discountAccrual.discountAccrual();
        System.out.println("VitalurShop orderPurchase " + purchase.getDate() + " " + purchase.getPrice());
        paymentStrategy.pay(purchase.getPrice());
    }
}
