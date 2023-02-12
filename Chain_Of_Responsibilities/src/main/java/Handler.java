public abstract class Handler implements IHandler {
    private Handler nextHandler;

    @Override
    public void handle(Event event) {
        if (nextHandler != null) {
            nextHandler.handle(event);
        }
    }

    public final Handler addNext(Handler n) {
        if (nextHandler != null) {
            nextHandler.addNext(n);
        }
        else {
            nextHandler = n;
        }
        return nextHandler;
    }
}
