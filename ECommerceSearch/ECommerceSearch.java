
import java.util.Arrays;
public class ECommerceSearch {

    public static void main(String[] args) {

        product[] products = {
            new product(101, "Laptop", "Electronics"),
            new product(102, "Mobile", "Electronics"),
            new product(103, "Shoes", "Fashion"),
            new product(104, "Watch", "Accessories")
        };
Arrays.sort(products, (p1, p2) -> p1.productName.compareToIgnoreCase(p2.productName));
       product found = linearSearch(products, "Shoes");

if (found != null) {
    System.out.println("Product Found: " + found.productName);
}
found = binarySearch(products, "Shoes");

if (found != null) {
    System.out.println("Binary Search Found: " + found.productName);
}
    }
    public static product linearSearch(product[] products, String name) {
    for (product product : products) {
        if (product.productName.equalsIgnoreCase(name)) {
            return product;
        }
    }
    return null;
}
public static product binarySearch(product[] products, String name) {

    int left = 0;
    int right = products.length - 1;

    while (left <= right) {

        int mid = (left + right) / 2;

        int result = products[mid].productName.compareToIgnoreCase(name);

        if (result == 0)
            return products[mid];
        else if (result < 0)
            left = mid + 1;
        else
            right = mid - 1;
    }

    return null;
}
}