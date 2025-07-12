public class test {
    public static void main(String[] args) {
        Image image = new ProxyImage("Capybara.jpeg");
        Image image2 = new ProxyImage("lol.png");

        image.display();
        System.out.println();

        image.display();
        System.out.println();

        image2.display();
        System.out.println();

        image2.display();
        System.out.println();
    }
}
