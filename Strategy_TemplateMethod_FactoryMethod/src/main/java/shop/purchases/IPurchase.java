package shop.purchases;

import java.time.LocalDate;

public interface IPurchase {
    double getPrice();
    LocalDate getDate();
}
