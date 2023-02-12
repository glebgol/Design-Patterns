public class Archers extends Handler {
    private void raiseArchers() {
        System.out.println("Archers are raised!!");
    }
    @Override
    public void handle(Event event) {
        if (event == Event.NORMAL) {
            raiseArchers();
        }
        else if (event == Event.WAR) {
            raiseArchers();
            super.handle(event);
        }
        else {
            super.handle(event);
        }
    }
}
