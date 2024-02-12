package lesson6.homework;

import java.util.Arrays;

class GenericStorage<T extends Person> {
    private static final int INITIAL_CAPACITY = 10;
    private T[] items;
    private int size;

    public GenericStorage() {
        items = (T[]) new Person[INITIAL_CAPACITY];
        size = 0;
    }

    public void addItem(T item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        if (size == items.length) {
            T[] newArray = Arrays.copyOf(items, items.length * 2);
            items = newArray;
        }
        items[size++] = item;
    }


    public void removeItem(int id) {
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                System.arraycopy(items, i + 1, items, i, size - i - 1);
                items[--size] = null;
                return;
            }
        }
        throw new IllegalArgumentException("Item with ID " + id + " not found.");
    }

    public T searchItem(int id) {
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                return items[i];
            }
        }
        throw new IllegalArgumentException("Item with ID " + id + " not found.");
    }

    public void displayAllItems() {
        if (size == 0) {
            System.out.println("No items to display.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(items[i].getId() + ": " + items[i].getName() + ", " + items[i].getAge());
        }
    }
}

