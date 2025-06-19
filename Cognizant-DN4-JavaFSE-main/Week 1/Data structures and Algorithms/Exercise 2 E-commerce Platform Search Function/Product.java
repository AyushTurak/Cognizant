public class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public Product(Product product) {
        this.productId = product.productId;
        this.productName = product.productName;
        this.category = product.category;
    }

    //    toString method
    @java.lang.Override
    public java.lang.String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}