import java.util.ArrayList;
import java.util.List;

public class ShopInventory {
    private List<Product> products;

    public ShopInventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
        }
    }
    
    public static void main(String[] args) {
        ShopInventory inventory = new ShopInventory();

        // Add existing products
        inventory.addProduct(new ExistingProduct("Laptop", 1200.00));
        inventory.addProduct(new ExistingProduct("Phone", 800.00));

        // Add grocery items using the adapter
        GroceryItem groceryItem1 = new GroceryItem("Milk", 1.50);
        GroceryItem groceryItem2 = new GroceryItem("Bread", 2.00);
        inventory.addProduct(new GroceryItemAdapter(groceryItem1));
        inventory.addProduct(new GroceryItemAdapter(groceryItem2));

        // Display all products
        inventory.displayProducts();
    }
}
