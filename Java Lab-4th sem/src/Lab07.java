import java.util.Vector;

class Item {
    int id;
    String name;
    int quantity;
    double price;

    public Item(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Quantity:" + quantity + ", price: " + price;
    }

    public void update(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

public class Lab07 {
    Vector<Item> inventory = new Vector<>();

    public void addItem(int id, String name, int quantity, double price) {
        inventory.add(new Item(id, name, quantity, price));
        System.out.println("ID no: " + id +", added to inventory." );
    }

    public void updateItem(int id, String name, int quantity, double price) {
        for (Item item : inventory) {
            if (item.id == id) {
                System.out.println("\nUpdating item with ID: " + id);
                item.update(name, quantity, price);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void removeItem(int id) {
        if(inventory.removeIf(item -> item.id == id)){
            System.out.println("\nRemoved item with ID: " + id);
        }else{
            System.out.println("\nItem not found.");
        }
    }

    public void displayItems() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("\nThe items in inventory: ");
            for (Item item : inventory) {
                System.out.println(item);
            }
        }
    }

    public void searchItem(int id) {
        for (Item item : inventory) {
            if (item.id == id) {
                System.out.println(item);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public static void main(String[] args) {
        Lab07 p = new Lab07();

        p.addItem(101, "Paracetamol", 100, 2.5);
        p.addItem(102, "Syringe", 200, 1.2);
        p.displayItems();

        p.updateItem(101, "Paracetamol 500mg", 150, 2.75);
        p.searchItem(101);

        p.removeItem(102);
        p.displayItems();
    }
}




