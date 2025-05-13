import java.util.Vector;

class Product{
    String name;
    double price;
    String category;

    public Product(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

public class Lab05 {
    private Vector <Product> inventory;
    public Lab05(){
        inventory = new Vector <> ();
    }
    public void addproduct(String name, double price, String category){
        Product product = new Product(name, price, category);
        inventory.add(product);
    }
    public void removeproduct(String name){
        for (int i =0; i< inventory.size(); i++){
            if(inventory.get(i).name.equalsIgnoreCase(name)){
                inventory.remove(i);
                break;
            }
        }
    }
    public void displayinventory(){
        System.out.println("Inventory: ");
        for(Product product: inventory){
            System.out.println("Name" + product.name + "price: " + product.price + "category:" + product.category);
            System.out.println();
        }
    }
    public static void main (String [] args){
        Lab05 manager = new Lab05();
        manager.addproduct("Laptop", 40000, "Electronics");
        manager.addproduct("Tshirt", 550, "Clothing");
        manager.addproduct("Book", 920, "Books");
        manager.displayinventory();
        manager.removeproduct("Book");
        manager.displayinventory();
        manager.removeproduct("Laptop");
        manager.displayinventory();
    }
}

