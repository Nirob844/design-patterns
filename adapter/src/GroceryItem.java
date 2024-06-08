public class GroceryItem {
    private String itemName;
    private double itemCost;

    public GroceryItem(String itemName, double itemCost) {
        this.itemName = itemName;
        this.itemCost = itemCost;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemCost() {
        return itemCost;
    }
}
