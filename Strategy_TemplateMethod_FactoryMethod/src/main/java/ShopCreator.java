import shop.EvrooptShop;
import shop.HitShop;
import shop.VitalurShop;
import shop.baseshops.Shop;

public class ShopCreator {
    public static Shop create(String name) {
        String upperCaseName = name.toUpperCase();
        return switch (upperCaseName) {
            case "VITALUR" -> new VitalurShop();
            case "EVROOPT" -> new EvrooptShop();
            case "HIT" -> new HitShop();
            default -> throw new IllegalArgumentException("There is not any " + name + " shop.");
        };
    }
}
