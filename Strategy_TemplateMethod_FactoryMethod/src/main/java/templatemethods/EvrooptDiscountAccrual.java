package templatemethods;

public class EvrooptDiscountAccrual extends DiscountAccrual {
    @Override
    protected void getData() {
        System.out.print("EvrooptDiscountAccrual:");
        super.getData();
    }

    @Override
    protected void calculateDiscount() {
        System.out.println("EvrooptDiscountAccrual calculateDiscount");
    }

    @Override
    protected void bonusCalculation() {
        System.out.println("EvrooptDiscountAccrual bonusCalculation");
    }
}
