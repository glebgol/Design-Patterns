import composite.Composite;
import composite.FileComponent;
import composite.IComponent;
import visitor.FileCountVisitor;
import visitor.FileSizeVisitor;

public class Client {
    public static void main(String[] args) {
        Composite composite = new Composite("big-folder");

        IComponent file1 = new FileComponent("file");
        composite.addComponent(file1);

        IComponent file2 = new FileComponent("file2");
        composite.addComponent(file2);

        Composite folder = new Composite("folder");
        folder.addComponent(new FileComponent("file-3"));
        composite.addComponent(folder);


        for (var component : composite) {
            component.display();
            component.acceptVisitor(new FileSizeVisitor());
            component.acceptVisitor(new FileCountVisitor());
        }
    }
}
