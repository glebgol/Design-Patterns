package composite;

import iterator.CompositeIterator;
import visitor.IVisitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Composite implements IComponent, Iterable<IComponent> {
    protected List<IComponent> components;
    protected String folderName;

    public Composite(String folderName) {
        this.folderName = folderName;
        components = new ArrayList<>();
    }
    @Override
    public void display() {
        System.out.println("\"" + folderName + "\"");
        for (var component : components) {
            component.display();
        }
    }

    @Override
    public void acceptVisitor(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public List<IComponent> getItems() {
        return components;
    }

    public void addComponent(IComponent component) {
        components.add(component);
    }

    public boolean removeComponent(IComponent component) {
        return components.remove(component);
    }

    public String getFolderName() {
        return folderName;
    }

    @Override
    public Iterator<IComponent> iterator() {
        return new CompositeIterator(this);
    }
}
