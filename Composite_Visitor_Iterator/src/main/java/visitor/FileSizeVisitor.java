package visitor;

import composite.Composite;
import composite.FileComponent;

public class FileSizeVisitor implements IVisitor {
    @Override
    public void visit(FileComponent component) {
        final int fileSize = component.getFileName().length();
        System.out.println(fileSize);
    }

    @Override
    public void visit(Composite composite) {
        final int folderSize = composite.getFolderName().length();
        System.out.println(folderSize);
    }
}
