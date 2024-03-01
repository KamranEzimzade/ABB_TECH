package Module_1_Exam_Project;

import java.util.ArrayList;
import java.util.List;

class InventoryManager {
    private List<InventoryItem> inventoryItems;

    public InventoryManager() {
        this.inventoryItems = new ArrayList<>();
    }

    public void addItem(InventoryItem item) {
        inventoryItems.add(item);
    }

    public InventoryItem findItem(int itemId) throws ItemNotFoundException {
        for (InventoryItem item : inventoryItems) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        throw new ItemNotFoundException("Item not found in inventory.");
    }

    public void updateItem(InventoryItem newItem) throws ItemNotFoundException, InvalidDataException {
        int itemId = newItem.getItemId();
        boolean found = false;
        for (int i = 0; i < inventoryItems.size(); i++) {
            if (inventoryItems.get(i).getItemId() == itemId) {
                if (newItem.getQuantity() < 0 || newItem.getPrice() < 0) {
                    throw new InvalidDataException("Invalid data for updating inventory item.");
                }
                inventoryItems.set(i, newItem);
                found = true;
                break;
            }
        }
        if (!found) {
            throw new ItemNotFoundException("Item not found in inventory.");
        }
    }

    public void deleteItem(int itemId) throws ItemNotFoundException {
        boolean removed = inventoryItems.removeIf(item -> item.getItemId() == itemId);
        if (!removed) {
            throw new ItemNotFoundException("Item not found in inventory.");
        }
    }

    public List<InventoryItem> readInventoryItems() {
        return inventoryItems;
    }

}
