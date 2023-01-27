public class Client {
    public static void main(String[] args) {
        final String file = "D:\\Images\\dogs.png";

        IImage image = new Image(file);
        image.display();

        IImage proxyImage = new ProxyImage(file);
        proxyImage.display();
    }
}
