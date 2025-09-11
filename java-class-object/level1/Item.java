public class Item {
    private int itemCode;
    private String itemName;
    private double price;

    // Constructor
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method
    public void displayItem(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: " + price);
        System.out.println("Total Cost for " + quantity + " items: " + (price * quantity));
    }

    public static void main(String[] args) {
        Item i1 = new Item(101, "Laptop", 55000);
        i1.displayItem(2);
    }
}
