package shop;

import shop.baseshops.EvrooptShopBase;
import shop.purchases.IPurchase;

public class HitShop extends EvrooptShopBase {
    @Override
    public void orderPurchase(IPurchase purchase) {
        System.out.print("HitShop:");
        super.orderPurchase(purchase);
    }
}
