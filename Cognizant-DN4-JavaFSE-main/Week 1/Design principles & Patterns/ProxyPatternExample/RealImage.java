public class RealImage implements Image {
    private String image;

    public RealImage(String image) {
        this.image = image;
        this.load();
    }

    public void load() {
        System.out.println("Loading: " + this.image);
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + this.image);
    }
}
