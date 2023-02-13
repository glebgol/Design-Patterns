public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("state1");

        CareTaker careTaker = new CareTaker(originator);
        careTaker.save();

        originator.setState("state2");
        careTaker.save();
        careTaker.save();

        careTaker.printHistory();

        careTaker.rollBack();


        careTaker.printHistory();
    }
}
