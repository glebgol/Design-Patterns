import composite.Composite;
import composite.FileComponent;
import composite.IComponent;
import visitor.FileCountVisitor;
import visitor.FileSizeVisitor;

public class Client {
    public static void main(String[] args) {
        IComponent c1 = new FileComponent("file");
        IComponent c2 = new FileComponent("file2");
        Composite c4 = new Composite("BAA");
        c4.addComponent(c1);
        c4.addComponent(c2);
        c4.display();
        c2.acceptVisitor(new FileSizeVisitor());
        c4.acceptVisitor(new FileCountVisitor());
    }
}
