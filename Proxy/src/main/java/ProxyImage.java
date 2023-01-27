public class ProxyImage implements IImage {
    protected String file;
    protected IImage image;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new Image(file);
        }
        image.display();
    }
}
