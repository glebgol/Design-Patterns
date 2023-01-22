package composite;

import java.util.List;

public class Composite implements IComponent {
    protected List<IComponent> components;
    protected String folderName;

    public Composite(String folderName) {
        this.folderName = folderName;
    }
    @Override
    public void display() {
        for (var component : components) {
            component.display();
        }
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
