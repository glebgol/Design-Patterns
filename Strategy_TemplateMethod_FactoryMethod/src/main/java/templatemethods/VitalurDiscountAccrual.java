package templatemethods;

public class VitalurDiscountAccrual extends DiscountAccrual {
    @Override
    protected void getData() {
        System.out.print("VitalurDiscountAccrual:");
        super.getData();
    }

    @Override
    protected void calculateDiscount() {
        System.out.println("VitalurDiscountAccrual calculateDiscount");
    }

    @Override
    protected void bonusCalculation() {
        System.out.println("VitalurDiscountAccrual bonusCalculation");
    }
}
