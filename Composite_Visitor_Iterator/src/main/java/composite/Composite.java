package composite;

import visitor.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IComponent {
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

    public void addComponent(IComponent component) {
        components.add(component);
    }

    public boolean removeComponent(IComponent component) {
        return components.remove(component);
    }

    public List<IComponent> getComponents() {
        return components;
    }

    public String getFolderName() {
        return folderName;
    }
}
