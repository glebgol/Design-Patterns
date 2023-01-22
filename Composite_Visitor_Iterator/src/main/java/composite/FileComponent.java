package composite;

import visitor.IVisitor;

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

    public String getFileName() {
        return fileName;
    }
}
