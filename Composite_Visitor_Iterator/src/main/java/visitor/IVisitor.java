package visitor;

import composite.Composite;
import composite.FileComponent;

public interface IVisitor {
    void visit(FileComponent component);
    void visit(Composite composite);
}
