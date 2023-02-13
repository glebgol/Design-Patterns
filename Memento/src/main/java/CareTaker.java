import java.util.Stack;

public class CareTaker {
    private final Stack<Memento> history;
    private final Originator originator;

    public CareTaker(Originator originator) {
        this.originator = originator;
        this.history = new Stack<>();
    }

    public void save() {
        history.push(originator.save());
    }

    public void rollBack() {
        originator.restore(history.pop());
    }

    public void printHistory() {
        for (var memento : history) {
            System.out.println(memento);
        }
        System.out.println();
    }
}
