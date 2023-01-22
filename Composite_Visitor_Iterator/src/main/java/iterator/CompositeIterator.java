package iterator;

import composite.Composite;
import composite.IComponent;

import java.util.ArrayList;
import java.util.Iterator;

public class CompositeIterator implements Iterator<IComponent> {
    protected ArrayList<IComponent> breadthFirstSearch = new ArrayList<>();
    IComponent currentItem;

    public CompositeIterator(IComponent component) {
        this.currentItem = component;
        breadthFirstSearch.add(currentItem);
    }

    @Override
    public boolean hasNext() {
        return !breadthFirstSearch.isEmpty();
    }

    @Override
    public IComponent next() {
        if (hasNext()) {
            IComponent nextItem = breadthFirstSearch.get(0);
            if (nextItem instanceof Composite) {
                breadthFirstSearch.addAll(currentItem.getItems());
            }
            breadthFirstSearch.remove(0);
            if (hasNext()) {
                currentItem = breadthFirstSearch.get(0);
            }
            return nextItem;
        }
        return null;
    }
}
