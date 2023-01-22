package composite;

import visitor.IVisitor;

public interface IComponent {
    void display();
    void acceptVisitor(IVisitor visitor);
}
