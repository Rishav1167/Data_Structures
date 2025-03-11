package LinkedList.Inventory_Management_System_SLL;

public class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    // Constructor
    public Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Item ID: " + itemId + ", Item Name: " + itemName + ", Quantity: " + quantity + ", Price: $" + price;
    }
}
