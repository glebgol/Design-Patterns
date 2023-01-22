package composite;

public class FileComponent implements IComponent {
    protected String fileName;

    public FileComponent(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("File: " + fileName);
    }
}
