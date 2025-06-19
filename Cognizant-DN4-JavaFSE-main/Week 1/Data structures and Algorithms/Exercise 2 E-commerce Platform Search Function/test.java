public class test {
    public static void main(String[] args) {
        Product[] unsortedProducts = {
                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(110, "Smartphone", "Electronics"),
                new Product(102, "T-shirt", "Fashion"),
                new Product(108, "Watch", "Accessories")
        };

        Product[] productsSortedById = unsortedProducts.clone();
        ProductSearch.sortProductsById(productsSortedById);

        Product[] productsSortedByName = unsortedProducts.clone();
        ProductSearch.sortProductsByNames(productsSortedByName);

        Product[] productsSortedByCategory = unsortedProducts.clone();
        ProductSearch.sortProductsByCategory(productsSortedByCategory);

        int searchId = 102;
        String searchString = "SmartPhone";

        Product productByLinearId = ProductSearch.linearSearchById(unsortedProducts, searchId);
        System.out.println("Product by searchId: " + searchId + "\n" + productByLinearId.toString());

        Product productByBinaryId = ProductSearch.binarySearchById(productsSortedById, searchId);
        System.out.println("Product by searchId: " + searchId + "\n" + productByBinaryId.toString());

        Product productByLinearName = ProductSearch.linearSearchByName(unsortedProducts, searchString);
        System.out.println("Product by searchString: " + searchString + "\n" + productByLinearName.toString());

        Product productByBinaryName = ProductSearch.binarySearchByName(productsSortedByName, searchString);
        System.out.println("Product by searchString: " + searchString + "\n" + productByBinaryName.toString());
    }
}