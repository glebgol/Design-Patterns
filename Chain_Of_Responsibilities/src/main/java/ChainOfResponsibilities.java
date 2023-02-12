public class ChainOfResponsibilities {
    protected Handler handler;

    public ChainOfResponsibilities() {
        handler = new Archers();

        handler
                .addNext(new Horsemen())
                .addNext(new Infantrymen());
    }

    public void handleEvent(Event event) {
        handler.handle(event);
    }
}
