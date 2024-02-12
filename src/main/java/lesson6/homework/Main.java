package lesson6.homework;

public class Main {
    public static void main(String[] args) {
        GenericStorage<Person> storage = new GenericStorage<>();

        storage.addItem(new Student("Aydın", 20));
        storage.addItem(new Student("Aytac", 22));
        storage.addItem(new Teacher("Valeh", 35));
        storage.addItem(new Teacher("Gulzar", 40));

        System.out.println("Displaying all items:");
        storage.displayAllItems();

        System.out.println("\nSearching for item with ID 2:");
        Person found = storage.searchItem(2);
        if (found != null) {
            System.out.println("Found: " + found.getName());
        } else {
            System.out.println("Item not found");
        }

        System.out.println("\nRemoving item with ID 3:");
        storage.removeItem(3);
        System.out.println("Displaying all items after removal:");
        storage.displayAllItems();
    }
}