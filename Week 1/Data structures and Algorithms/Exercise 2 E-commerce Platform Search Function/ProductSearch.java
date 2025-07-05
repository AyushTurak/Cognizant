import java.util.Arrays;

public class ProductSearch {
    public static Product binarySearchById(Product[] products, int searchId) {
        int start = 0;
        int end = products.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (searchId == products[mid].productId) return products[mid];
            else if (searchId > products[mid].productId) start = mid + 1;
            else if (searchId < products[mid].productId) end = mid - 1;
        }

        return null;
    }

    public static Product linearSearchById(Product[] products, int searchId) {
        for (Product product: products) {
            if (product.productId == searchId)
                return product;
        }
        return null;
    }

    public static Product linearSearchByName(Product[] products, String searchName) {
        for (Product product: products) {
            if (product.productName.equalsIgnoreCase(searchName)) return product;
        }
        return null;
    }

    public static Product binarySearchByName(Product[] products, String searchName) {
        int start = 0;
        int end = products.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int result = products[mid].productName.compareToIgnoreCase(searchName);

            if (result == 0) return products[mid];
            else if (result < 0) start = mid + 1;
            else if (result > 0) end = mid - 1;
        }
        return null;
    }

    public static void sortProductsById(Product[] products) {
        Arrays.sort(products, (a, b) -> Integer.compare(a.productId, b.productId));
    }

    public static void sortProductsByNames(Product[] products) {
        Arrays.sort(products, (a, b) -> a.productName.compareTo(b.productName));
    }

    public static void sortProductsByCategory(Product[] products) {
        Arrays.sort(products, (a, b) -> a.category.compareTo(b.category));
    }
}