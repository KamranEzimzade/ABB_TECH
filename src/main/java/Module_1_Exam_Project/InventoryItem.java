package Module_1_Exam_Project;

class InventoryItem {
    private int itemId;
    private String name;
    private int quantity;
    private double price;

    public InventoryItem(int itemId, String name, int quantity, double price) throws InvalidDataException {
        if (itemId <= 0 || quantity < 0 || price < 0) {
            throw new InvalidDataException("Invalid data for inventory item.");
        }
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

}
