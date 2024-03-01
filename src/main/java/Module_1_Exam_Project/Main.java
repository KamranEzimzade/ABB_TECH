package Module_1_Exam_Project;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            InventoryManager manager = new InventoryManager();

            manager.addItem(new InventoryItem(1, "Item 1", 3, 5));
            manager.addItem(new InventoryItem(2, "Item 2", 7, 9));
            manager.addItem(new InventoryItem(3, "Item 3", 9, 46));
            manager.addItem(new InventoryItem(4, "Item 4", 12, 55));
            manager.addItem(new InventoryItem(5, "Item 5", 14, 36));


            List<InventoryItem> items = manager.readInventoryItems();
            System.out.println("Inventory Items:");
            for (InventoryItem item : items) {
                System.out.println(item.getItemId() + " " + item.getName() + " " + item.getQuantity() + " " + item.getPrice());
            }

            InventoryItem foundItem = manager.findItem(5);
            System.out.println("Found item: " + foundItem.getName());

            InventoryItem updatedItem = new InventoryItem(3, "Updated Item", 17, 18.88);
            manager.updateItem(updatedItem);
            System.out.println("Item updated successfully.");

            manager.deleteItem(2);
            System.out.println("Item deleted successfully.");
        } catch (InvalidDataException | ItemNotFoundException e) {
            e.printStackTrace();
        }
    }
}
