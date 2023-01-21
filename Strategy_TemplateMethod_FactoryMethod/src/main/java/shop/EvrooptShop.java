package shop;

import shop.baseshops.EvrooptShopBase;
import shop.purchases.IPurchase;

public class EvrooptShop extends EvrooptShopBase {
    @Override
    public void orderPurchase(IPurchase purchase) {
        System.out.print("EvrooptShop:");
        super.orderPurchase(purchase);
    }
}
