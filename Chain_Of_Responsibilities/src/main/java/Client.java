public class Client {
    public static void main(String[] args) {
        ChainOfResponsibilities chain = new ChainOfResponsibilities();

        chain.handleEvent(Event.WAR);
    }
}
