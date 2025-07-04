import java.util.Vector;

class Product {
    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String toString() {
        return "Name: " + name + ", Price: Rs" + price + ", Category: " + category;
    }

    public String getName() {
        return name;
    }
}

public class Lab05 {
    Vector<Product> inventory = new Vector<>();

    public void addProduct(Product product) {
        inventory.add(product);
        System.out.println(product.getName() + " added to inventory.");
    }

    public void removeProduct(String name) {
        if(inventory.removeIf(product -> product.name == name)) {
            System.out.println("\nRemoved product with name: " + name);
        }else{
            System.out.println("\nNo product name found.");
        }
    }


    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        }else{
            System.out.println("\nCurrent Inventory:");
            for (Product product : inventory) {
                System.out.println(product);
            }
        }
    }

    public static void main(String[] args) {
        Lab05 manager = new Lab05();
        manager.addProduct(new Product("Laptop", 50000, "Electronics"));
        manager.addProduct(new Product("Shirt", 1200, "Clothing"));
        manager.addProduct(new Product("Book", 300, "Education"));
        manager.displayInventory();
        manager.removeProduct("Shirt");
        manager.displayInventory();
    }
}
