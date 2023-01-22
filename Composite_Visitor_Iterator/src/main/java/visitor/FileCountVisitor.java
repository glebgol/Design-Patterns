package visitor;

import composite.Composite;
import composite.FileComponent;

public class FileCountVisitor implements IVisitor {
    @Override
    public void visit(FileComponent component) {
        final int count = 1;
        System.out.println(count);
    }

    @Override
    public void visit(Composite composite) {
        final int count = composite.getItems().size();
        System.out.println(count);
    }
}
