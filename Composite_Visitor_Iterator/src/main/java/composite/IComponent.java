package composite;

import visitor.IVisitor;

import java.util.List;

public interface IComponent {
    void display();
    void acceptVisitor(IVisitor visitor);
    List<IComponent> getItems();
}
