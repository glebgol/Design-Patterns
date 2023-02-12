public class Horsemen extends Handler {
    private void raiseHorses() {
        System.out.println("Horsemen are raised!!");
    }
    @Override
    public void handle(Event event) {
        if (event == Event.CONFLICT) {
            raiseHorses();
        }
        else if (event == Event.WAR) {
            raiseHorses();
            super.handle(event);
        }
        else {
            super.handle(event);
        }
    }
}
