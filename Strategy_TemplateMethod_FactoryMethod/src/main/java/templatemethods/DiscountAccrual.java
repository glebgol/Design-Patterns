package templatemethods;

public abstract class DiscountAccrual {
    protected void getData() {
        System.out.println("Get data of purchase");
    }

    protected abstract void calculateDiscount();
    protected abstract void bonusCalculation();

    public void discountAccrual() {
        getData();
        calculateDiscount();
        bonusCalculation();
    }
}
