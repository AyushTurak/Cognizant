public class ProxyImage implements Image {
    private String image;
    private RealImage realImage;

    public ProxyImage(String image) {
        this.image = image;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(image);
        } else {
            System.out.println("Using cached image: " + this.image);
            realImage.display();
        }
    }
}
