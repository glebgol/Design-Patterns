public class Infantrymen extends Handler {
    private void raiseInfantry() {
        System.out.println("Infantrymen are raised!!");
    }
    @Override
    public void handle(Event event) {
        if (event == Event.DANGER) {
            raiseInfantry();
        }
        else if (event == Event.WAR) {
            raiseInfantry();
            super.handle(event);
        }
        else {
            super.handle(event);
        }
    }
}
