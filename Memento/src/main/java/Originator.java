public class Originator {
    public Originator(String state) {
        this.state = state;
    }

    protected String state;

    public void setState(String state) {
        this.state = state;
    }

    Memento save() {
        return new Memento(state);
    }

    public void restore(Memento memento) {
        state = memento.getState();
    }
}
