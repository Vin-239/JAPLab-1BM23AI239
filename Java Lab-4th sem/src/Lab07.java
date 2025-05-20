import java.util.Scanner;
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

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Quantity: " + quantity + ", Price: " + price);
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
    }

    public void updateItem(int id, String name, int quantity, double price) {
        for (Item item : inventory) {
            if (item.id == id) {
                item.update(name, quantity, price);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void removeItem(int id) {
        inventory.removeIf(item -> item.id == id);
    }

    public void displayItems() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            inventory.forEach(Item::display);
        }
    }

    public void searchItem(int id) {
        for (Item item : inventory) {
            if (item.id == id) {
                item.display();
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lab07 lab07 = new Lab07();

        while (true) {
            System.out.println("\n1. Add Item\n2. Update Item\n3. Remove Item\n4. Display Items\n5. Search Item\n6. Exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                System.out.print("Enter price: ");
                double price = scanner.nextDouble();
                lab07.addItem(id, name, quantity, price);
            } else if (choice == 2) {
                System.out.print("Enter ID to update: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new quantity: ");
                int quantity = scanner.nextInt();
                System.out.print("Enter new price: ");
                double price = scanner.nextDouble();
                lab07.updateItem(id, name, quantity, price);
            } else if (choice == 3) {
                System.out.print("Enter ID to remove: ");
                int id = scanner.nextInt();
                lab07.removeItem(id);
            } else if (choice == 4) {
                lab07.displayItems();
            } else if (choice == 5) {
                System.out.print("Enter ID to search: ");
                int id = scanner.nextInt();
                lab07.searchItem(id);
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}




