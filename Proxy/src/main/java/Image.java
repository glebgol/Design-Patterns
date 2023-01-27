public class Image implements IImage {
    protected String file;
    public Image(String file) {
        this.file = file;
        load();
    }

    private void load() {
        System.out.println("Load " + file + " image");
    }

    @Override
    public void display() {
        System.out.println("Display " + file + " image");
    }
}
