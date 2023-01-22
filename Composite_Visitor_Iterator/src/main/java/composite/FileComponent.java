package composite;

import visitor.IVisitor;

import java.util.List;

public class FileComponent implements IComponent {
    protected String fileName;

    public FileComponent(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("File: " + fileName);
    }

    @Override
    public void acceptVisitor(IVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public List<IComponent> getItems() {
        return List.of(this);
    }

    public String getFileName() {
        return fileName;
    }
}
